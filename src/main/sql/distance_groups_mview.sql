WITH stuttgart_trips AS (
	SELECT t.*
	FROM matsim_input.agents_homes_with_raumdata h
	INNER JOIN matsim_output.trips t
	ON h.person_id = t.person
	WHERE h.ags = '08111000'
),

groups AS (
	SELECT
		run_name,
		'LH Stuttgart' as area,
		COUNT(person) no_trips,
		main_mode,
		CASE
			WHEN traveled_distance between 0 AND 499 then 'unter_500m'
			WHEN traveled_distance between 500 AND 999 then '500m_bis_1km'
			WHEN traveled_distance between 1000 AND 1999 then '1km_bis_2km'
			WHEN traveled_distance between 2000 AND 4999 then '2km_bis_5km'
			WHEN traveled_distance between 5000 AND 9999 then '5km_bis_10km'
			WHEN traveled_distance between 10000 AND 19999 then '10km_bis_20km'
			WHEN traveled_distance between 20000 AND 49999 then '20km_bis_50km'
			WHEN traveled_distance between 50000 AND 99999 then '50km_bis_100km'
			ELSE 'ueber_100km'
		END AS distance_group
	FROM stuttgart_trips
	GROUP BY run_name, main_mode, distance_group
)
		
SELECT
	*,  ROUND((no_trips / SUM(no_trips) OVER (partition by run_name, main_mode))* 100, 1) AS mode_share
FROM groups
ORDER BY run_name, main_mode, distance_group