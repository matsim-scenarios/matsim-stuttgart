package org.matsim.stuttgart.run;

import org.junit.Test;
import org.matsim.core.controler.AbstractModule;

public class TestGunnarsCalibration {

    @Test
    public void testitsest() {

        var config = RunStuttgart.loadConfig(new String[]{"C:\\Users\\Janekdererste\\repos\\shared-svn\\projects\\matsim-stuttgart\\stuttgart-v2.0\\input\\config.xml"});
        config.plans().setInputFile("population-0pct-stuttgart.xml.gz");
        config.qsim().setFlowCapFactor(0.001);
        config.qsim().setStorageCapFactor(0.001);

        var scenario = RunStuttgart.loadScenario(config);
        var controler = RunStuttgart.loadControler(scenario);
        controler.addOverridingModule(new AbstractModule() {
            @Override
            public void install() {
                this.addControlerListenerBinding().to(WireModalShareCalibratorIntoMATSimControlerListener.class);
            }
        });
        controler.run();
    }
}
