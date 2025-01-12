package com.tomato.mybatis.mapper.provider;

import com.tomato.mybatis.mapping.TableInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;

import java.util.stream.Stream;

/**
 * 插入provider
 * @author lizhifu
 */
@Slf4j
public class InsertSqlProvider extends AbstractSqlProviderSupport {
    /**
     * sql
     * @param context context
     * @return  sql
     */
    public String sql(ProviderContext context) {
        String cacheKey = getCacheKey(context);
        return SQL_CACHE.computeIfAbsent(cacheKey, value -> {
            TableInfo table = tableInfo(context);
            SQL sql = new SQL()
                    .INSERT_INTO(table.tableName)
                    .INTO_COLUMNS(table.columns)
                    .INTO_VALUES(Stream.of(table.fields).map(TableInfo::bindParameter).toArray(String[]::new));
            log.info("Mybatis通用Mapper|cacheKey:{}|insert sql:\n{}",cacheKey,sql.toString());
            return sql.toString();
        });
    }
}