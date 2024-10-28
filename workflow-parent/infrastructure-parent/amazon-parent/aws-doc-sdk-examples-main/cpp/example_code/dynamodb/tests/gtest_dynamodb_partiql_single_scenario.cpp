/*
   Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
   SPDX-License-Identifier: Apache-2.0
*/


#include <gtest/gtest.h>
#include <fstream>
#include "dynamodb_gtests.h"
#include "dynamodb_samples.h"

namespace AwsDocTest {

    // NOLINTNEXTLINE (readability-named-parameter)
    TEST_F(DynamoDB_GTests, paritql_single_execute_scenario
    ) {
        AddCommandLineResponses({
                                        "Jaws",
                                        "1972",
                                        "8",
                                        "Sharks",
                                        "7",
                                        "Sharks and Dude",
                                        "y",
                                        "2011",
                                        "2011",
                                        "2018",
                                        "30",
                                        "y"
                                }
        );
        bool result = createTableForScenario();
        ASSERT_TRUE(result);

        result = AwsDoc::DynamoDB::partiqlExecuteScenario(*s_clientConfig);
        ASSERT_TRUE(result);
    }

} // AwsDocTest