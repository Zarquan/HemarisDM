package org.ivoa.dm.executionbroker;
/*
 * Created on 10/05/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import org.ivoa.vodml.testing.AutoRoundTripWithValidationTest;

/**
 * This will run a XML and JSON round trip test on the model inst
 */
public class ExecutionBrokerModelTest extends AutoRoundTripWithValidationTest<ExecbrokerModel> {

    @Override
    public ExecbrokerModel createModel() {
        ExecbrokerModel retval = new ExecbrokerModel();
        //TODO create some content.
        return retval;
    }

    @Override
    public void testModel(ExecbrokerModel execbrokerModel) {
         //TODO actually perform some tests
    }
}
