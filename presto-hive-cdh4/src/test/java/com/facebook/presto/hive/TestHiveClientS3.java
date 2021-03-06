/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.hive;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class TestHiveClientS3
        extends AbstractTestHiveClientS3
{
    @Parameters({
            "hive.cdh4.metastoreHost",
            "hive.cdh4.metastorePort",
            "hive.cdh4.databaseName",
            "hive.cdh4.s3.awsAccessKey",
            "hive.cdh4.s3.awsSecretKey",
            "hive.cdh4.s3.writableBucket",
    })
    @BeforeClass
    @Override
    public void setup(String host, int port, String databaseName, String awsAccessKey, String awsSecretKey, String writableBucket)
    {
        super.setup(host, port, databaseName, awsAccessKey, awsSecretKey, writableBucket);
    }
}
