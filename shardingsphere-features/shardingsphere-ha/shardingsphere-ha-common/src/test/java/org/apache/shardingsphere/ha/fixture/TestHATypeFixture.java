/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.ha.fixture;

import org.apache.shardingsphere.ha.spi.HAType;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Map;

/**
 * Test HA type.
 */
public final class TestHATypeFixture implements HAType {
    
    @Override
    public void checkHAConfig(final Map<String, DataSource> dataSourceMap, final String schemaName) {
    }
    
    @Override
    public void updatePrimaryDataSource(final Map<String, DataSource> activeDataSourceMap, final String schemaName, final Collection<String> disabledDataSourceNames) {
    }
    
    @Override
    public void updateMemberState(final Map<String, DataSource> dataSourceMap, final String schemaName, final Collection<String> disabledDataSourceNames) {
    }
    
    @Override
    public void startPeriodicalUpdate(final Map<String, DataSource> dataSourceMap, final String schemaName, final Collection<String> disabledDataSourceNames) {
    }
    
    @Override
    public void stopPeriodicalUpdate() {
    }
    
    @Override
    public String getPrimaryDataSource() {
        return null;
    }
    
    @Override
    public String getType() {
        return "Test";
    }
}
