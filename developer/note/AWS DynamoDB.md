# AWS DynamoDB

## Quiz

- DynamoDB Accelerator(DAX) is a fully managed, highly available, in-memory cache for DynamoDB that delivers up to 10x performance improvement. it caches the most frequently used data, thus offloading the heavy reads on hot keys of your DynamoDB table. hence preventing the "ProvisionedThroughputExceededException" exception.
- The maximum size of an item in a DynamoDB table is 400KB
- We can do 2 Eventually Consistent reads per seconds for items of 4 KB with 1 RCU.
- Global Secondary Index(GSI) uses an independent amount of RCU and WCU and if they are throttled due to insufficient capacity, then the main table will also be throttled.