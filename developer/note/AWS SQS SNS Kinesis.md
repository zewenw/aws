# AWS: SQS SNS Kinesis

- SQS can be scales automatically
- SQS Delay Queues is a period of time during which Amazon SQS keep messages invisible to consumers, In SQS Delay Queues, a message is hidden when it is first added to the queue.(default 0, max: 15min)
- SQS Visibility Timeout is a period of time during which Amazon SQS prevents other consumers from receiving and processing the message again. In visibility Timeout, a message is hidden only after it is consumed from the queue. Increasing the Visibility Timeout gives more time to the consumer to process the messages and prevent duplicate reading of the message.(default: 30 sec, min: 0 sec, max: 12 hours)
- The capacity limits of a Kinesis data stream are defined by the number of shards within the data stream. The limits can be exceeded by either data throughput or the number of reading data calls. each shard allows for 1MB/s incoming data and 2MB/s outgoing data. you should increase the number of shards within your data stream to provide enough capacity.
- Kinesis Data Streams + Kinesis Data Firehouse is a perfect combo technology for loading data near real-time data into S3 and RedShift. Kinesis Data Firehouse supports custom data transformations using AWS Lambda.
- SQS message size limit is 256KB, but you want to send message of 1MB, you should use the SQS Extended Client Library.
- You can configure the Amazon SQS message retention period to a value from 1 minute to 14 days. the default it 4 days.
- When using Kinesis Client Library. each shard is to be read-only by on KCL instance. So, if you have 10 shards, then the maximum KCL instances you can have is 10.
- You can have as many consumers as "MessageGroupID" for your SQS FIFO queues simutaneously.