package org.matsim.stuttgart.run;

import org.junit.Ignore;
import org.junit.Test;
import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.controler.Controler;

public class StuttgartMasterThesisRunTest {
    /*

    @Test
    @Ignore
    public void testRunnerWithAllExtensions(){

        String configInput = "C:/Users/david/OneDrive/02_Uni/02_Master/05_Masterarbeit/03_MATSim/02_runs/stuttgart-v1.0/02_stuttgart-v1.0_test/stuttgart-v1.0-0.001pct.config_test.xml" ;
        Config config = StuttgartMasterThesisRunner.prepareConfig(new String[]{configInput} ) ;

        // Some config modifications for the reduced test
        config.controler().setLastIteration(2) ;
        config.controler().setOutputDirectory("C:/Users/david/OneDrive/02_Uni/02_Master/05_Masterarbeit/03_MATSim/02_runs/stuttgart-v1.0/02_stuttgart-v1.0_test/output");

        String fareZoneShapeFile = "C:/Users/david/OneDrive/02_Uni/02_Master/05_Masterarbeit/03_MATSim/02_runs/stuttgart-v1.0/02_stuttgart-v1.0_test/input/fareZones_sp.shp";
        String parkingZoneShapeFile = "C:/Users/david/OneDrive/02_Uni/02_Master/05_Masterarbeit/03_MATSim/02_runs/stuttgart-v1.0/02_stuttgart-v1.0_test/input/parkingShapes.shp";
        Scenario scenario = StuttgartMasterThesisRunner.prepareScenario(config) ;
        StuttgartMasterThesisRunner.finishScenario(scenario, fareZoneShapeFile, parkingZoneShapeFile);

        Controler controler = StuttgartMasterThesisRunner.prepareControler(scenario) ;
        controler.run() ;

    }

     */
}
