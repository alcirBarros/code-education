package br.com.context.repository.redis;

import org.springframework.data.redis.core.convert.KeyspaceConfiguration;

public class RedisKeySpaceConfig extends KeyspaceConfiguration {

    @Override
    public boolean hasSettingsFor(Class<?> type) {
        return true;
    }

    @Override
    public KeyspaceSettings getKeyspaceSettings(Class<?> type) {

        KeyspaceSettings keyspaceSettings = new KeyspaceSettings(type, "my-keyspace");
        keyspaceSettings.setTimeToLive(2000l);

        return keyspaceSettings;
    }
}
