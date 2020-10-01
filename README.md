# Spring Boot Couch DB

### Spring Boot Version: 2.3.4.RELEASE

## Create an Index for Query Operations

We must create an index if we intent to support query operations such as:
* count
* findAll
* deleteAll

To create an index, execute the following command from the query editor:

```sql
CREATE PRIMARY INDEX `example-primary-index` ON `bucket-name` USING GSI
```

For more info about Couchbase indexes, please [consult the documentation](https://docs.couchbase.com/server/current/n1ql/n1ql-language-reference/createprimaryindex.html).
