# AWS RDS(Relational Database)

## Quiz

- Read Replicas add new endpoints with their own DNS name, We need to change our application to reference them individually to balance the read load.
- Multi-AZ keeps the same connection string regardless of which database is up.
- A Read Replica in a different AWS Region than the source database can be used as a standby database and promoted to become the new production database in case of a regional disruption. so we'll have a highly available(Because of Multi-AZ) RDS DB instance in the destination AWS Region with both read and write available.
- Read Replicas uses Asynchronous Replication and Multi-AZ uses Synchronous Replication
- From your RDS database, you can have up to 15 replicas.
- you can not create encrypted Read Replicas from an unencrypted RDS DB instance.
- 10 Aurora Read Replicas can have in a single Aurora DB Cluster.

Q: You have a MySQL RDS database instance on which you want to enforce SSL connections, what should you do?

A: Execute a REQUIRE SSL SQL statement to all your DB users.