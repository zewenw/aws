# Solutions Architecture

- **Elastic IP** : An Elastic IP(EIP) is a static public IPv4 address provided by AWS,  it allows you to associate persistent IP address with your AWS resources, such as EC2 instances, NAT gateways and load balancers.
- **A well architected application** comes with five pillars: costs, performance, reliability, security, operational excellence.
- **Security Group**
  - if your application is not accessible(time out), then it's a security group issue
  - if your application gives a "connection refused" error, then it's an application error or it's not launched.
- **AWS Storage Gateway** bridge between on-premises data and cloud data
- **AWS DataSync** moves large amount of data between on-premises and S3, EFS, FSx for Windows
- **AWS DataSync** moves large amount of data to and from
  - On-premises/ other cloud to AWS(NFS, SMB, HDFS, S3 API) - needs agent
  - AWS to AWS(different storage services) - no agent needed

- **AWS Transfer Family** is a fully-managed service for file transfers into and out of Amazon s3 or Amazon EFS using the FTP protocol. can be used to share content with authenticated customers 
- **AWS S3 Access Logs**  log all the requests made to S3 buckets and Amazon Athena can be then used to run serverless analytics on top of the log files.
- **AWS S3 Legal Hold**:
  - protect the object indefinitely, independent from retention period
  - can be freely placed and removed using the `s3: PutObjectLegalHold` IAM Permission
- **AWS Price Classes** can be used to reduce the number of edge location for cost reduction
- **AWS Snowball** has computing capabilities and allows you to pre-process the data while it's being moved into snowball
- **AWS App Runner** is a fully managed service that makes it easy to deploy web applications and APIs at scale
- **AWS Lambda** maximum execution time is 15 minutes, if some logic need execute more than this then deploy it in EC2 instance.
- **DynamoDB** item has a maximum size of 400KB
- **AWS KeySpace** is a substitute of Apache Cassandra database
- **Cross Account Policy** 
  - Caller is a AWS Service should have a IAM Role policy allow it to access specific action on specific resource, usually should be the Called party.
  - Called party should be attached with resource policy and allow caller execute specific action on it.

- **AWS Transcribe** is an AWS service that makes it easy for customers to convert speech-to-text. 
- **AWS Polly** is a service that turns text into lifelike speech
- **AWS Connect**  is a self-service, cloud-based contact centre service that make it easy for any business to deliver better customer service at lower cost
- **AWS Lex** is a service for building conversational interfaces into any application using voice and text. Lex provides the advanced deep learning functionalities of automatic speech recognition(ASR) for converting speech to text, and natural language understanding(NLU) to recognize the intent of the text, to enable you to build applications with highly engaging user experiences and lifelike conversational interactions.
- **AWS Forecast**  is a fully managed service that uses machine learning to deliver highly accurate forecasts.
- **AWS Kendra** is a highly accurate and easy to use enterprise search service that's powered by machine learning.
- **AWS Personalize** is a machine learning service that makes it easy for developers to create individualized recommendations for customers using their applications.
- **AWS Comprehend** is a natural language processing(NLP) service that uses machine learning to find meaning and insights in text.
- **AWS SageMaker** is a fully managed service that provides every developer and data scientist with the ability to build, train, and deploy machine learning(ML) models quickly.
- **AWS CloudWatch** has some out-of-box metrics for EC2 - disk, CPU, network(high level)
- **CloudWatch Metric Stream** is a CloudWatch feature that allows you to send CloudWatch metrics in near real-time to S3 bucket (through Kinesis Data Firehose) and 3rd party destinations (e.g., Splunk, Datadog, …).
- **KMS Key Policies** can be used to control access to your KMS CMKs
- **AWS SSM Parameters Store** can be used to store secrets and has built-in version tracking capability, each time you edit the value of a parameter, SSM Parameter Store creates a new version of the parameter and retains the previous versions, you can view details, including the values, of all versions in a parameter's history.
- **KMS Multi-Region Keys** are identical KMS keys in different AWS Regions that can be use interchangeably. use cases such as global client-side encryption, encryption on Global DynamoDB, Global Aurora.
- **CIDR** shouldn't overlap, and the max CIDR size in AWS is /16, 5 IP are reserved by AWS
- **VPC Peering** route tables must be updated in both VPCs that are peered.
- **Amazon S3 & DynamoDB** are the two services have a VPC Gateway Endpoint, all the other have an interface endpoint(Powered by Private Link,  means a private IP)
  <<<<<<< HEAD
- **AWS VPN Cloud-Hub** allows you to securely communicate with multiple sites using AWS VPN, it operates on a simple hub-and-spoke model that you can use with or without a VPC.
- **Dual-Stack** refers to the capability of a network or a system to support both IPv4 and IPv6.
- **AWS Backup** centrally manage and automate backups across AWS services.

