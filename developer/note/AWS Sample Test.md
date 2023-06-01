# AWS Sample Test

## DynamoDB

- DynamoDB uses eventually consistent reads by default, Strong Consistent reads apply only while using the  read operations(such as GetItem, Query, and Scan)
- `UpdateItem` action of DynamoDB APIs, edits an existing item's attributes or adds a new item to the table if it does not already exist. You can put, delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected attribute values).
- DynamoDB has two built-in backup methods (On-demand, Point-in-time recovery) that write to Amazon S3, but you will not have access to the S3 buckets that are used for these backups. To create backups that you can download locally or use in another AWS services, use AWS Data Pipeline, Amazon EMR, or AWS Glue.
- With Amazon DynamoDB transactions, you can group multiple actions together and submit them as a single all-or-nothing `TransactWriteItems` or `TransactGetItems` operation.



## CloudFormation

- In CloudFormation, parameters are all independent and cannot depend on each other. Therefore, this is an invalid parameter type.

- CloudFormation currently supports the following parameter types:

  ```shell
  String – A literal string
  Number – An integer or float
  List<Number> – An array of integers or floats
  CommaDelimitedList – An array of literal strings that are separated by commas
  AWS::EC2::KeyPair::KeyName – An Amazon EC2 key pair name
  AWS::EC2::SecurityGroup::Id – A security group ID
  AWS::EC2::Subnet::Id – A subnet ID
  AWS::EC2::VPC::Id – A VPC ID
  List<AWS::EC2::VPC::Id> – An array of VPC IDs
  List<AWS::EC2::SecurityGroup::Id> – An array of security group IDs
  List<AWS::EC2::Subnet::Id> – An array of subnet IDs
  ```

- Drift detection enables you to detect whether a stack's actual configuration differs, or has drifted, from its expected configuration.

## CloudWatch

- You can publish your own metrics, known as custom metrics, to CloudWatch using the AWS CLI or an API.

  Each metric is one of the following:

  - Standard resolution, with data having a one-minute granularity. Metrics produced by AWS services are standard resolution by default. 

  - High resolution, with data at a granularity of one second

- **CloudWatch Logs** Insights enables you to interactively search and analyze your log data in Amazon CloudWatch Logs.

- 

## EC2 Instance

- General Purpose SSD (gp2) Between a minimum of 100 IOPS (at 33.33 GiB and below) and a maximum of 16,000 IOPS (at 5,334 GiB and above), baseline performance scales linearly at 3 IOPS per GiB of volume size.
- **User Data** is generally used to perform common automated configuration tasks and even run scripts after the instance starts. when you launch an instance in Amzaon EC2, you can pass two types of user data - shell scripts and cloud-init directives. 
  - by default, scripts entered as user data are executed with root privileges
  - by default, use data runs only during the boot cycle when you first launch an instance.
- **Zonal Reserved Instances** - A zonal Reserved Instance provides a capacity reservation in the specified Availability Zone. 
- **Regional Reserved Instances** - When you purchase a Reserved Instance for a Region, it's referred to as a regional Reserved Instance. A regional Reserved Instance does not provide a capacity reservation.
- For Provisioned IOPS SSD(io1),  The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1.



## AWS Security Token Service(STS)

- AWS Security Token Service (AWS STS) is a web service that enables you to request temporary, limited-privilege credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users). However, it is not supported by API Gateway.

## Lambda

- You can configure Application Auto Scaling to manage provisioned concurrency on a schedule or based on utilization. By allocating provisioned concurrency before an increase in invocations, you can ensure that all requests are served by initialized instances with very low latency.<img src="C:\Users\t1551\AppData\Roaming\Typora\typora-user-images\image-20230525114004075.png" alt="image-20230525114004075" style="zoom:80%;" />

- You can package your Lambda function code and dependencies as a container image, using tools such as the Docker CLI. You can then upload the image to your container registry hosted on Amazon Elastic Container Registry (Amazon ECR). Note that you must create the Lambda function from the same account as the container registry in Amazon ECR.
-  To deploy a container image to Lambda, the container image must implement the Lambda Runtime API. The AWS open-source runtime interface clients implement the API. You can add a runtime interface client to your preferred base image to make it compatible with Lambda.
-  Lambda currently supports only Linux-based container images.
-  You can test the containers locally using the Lambda Runtime Interface Emulator.
- You can deploy Lambda function as container image with the maximum size of 10GB.

## AWS ECS(Elastic Container Service)

- Amazon Elastic Container Service (Amazon ECS) is a highly scalable, fast, container management service that makes it easy to run, stop, and manage Docker containers on a cluster. You can host your cluster on a serverless infrastructure that is managed by Amazon ECS by launching your services or tasks using the Fargate launch type. For more control over your infrastructure, you can host your tasks on a cluster of Amazon Elastic Compute Cloud (Amazon EC2) instances that you manage by using the EC2 launch type.
- When you deploy your services using Amazon Elastic Container Service (Amazon ECS), you can use dynamic port mapping to support multiple tasks from a single service on the same container instance.  but Classic Load Balancer don't support dynamic port mapping, can use application load balancer

## AWS X-Ray

- AWS X-Ray sampling refers to the process of capturing and analyzing traces of requests made to an application or service. Sampling is used to collect a representative subset of requests for analysis, as capturing and analyzing every request can be resource-intensive and overwhelming.

## Kinesis Data Stream & Analytics & Firehose

### Stream

- The capacity limits of an Amazon Kinesis data stream are defined by the number of shards within the data stream. The limits can be exceeded by either data throughput or the number of PUT records.
-  You should use enhanced fan-out if you have, or expect to have, multiple consumers retrieving data from a stream in parallel. 

### Analytics

### Firehose

- Amazon Kinesis Data Firehose is a fully managed service for delivering real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon Redshift, Amazon Elasticsearch Service (Amazon ES), and Splunk. 

## VPC

- **network address translation (NAT)** gateway to enable instances in a private subnet to connect to the internet or other AWS services, but prevent the internet from initiating a connection with those instances.
- An **internet gateway** is a horizontally scaled, redundant, and highly available VPC component that allows communication between your VPC and the internet.
- To define access to the internet and between subnets, we use **Route Table**

## Elastic Cache

- Amazon ElastiCache is a fully managed in-memory data store, compatible with Redis or Memcached. 
- 

## CI&CD

### CodeBuild

- **buildspec.yml**  file in the root directory is a file used by AWS CodeBuild to run a build. 
- **Code Build** is a fully managed continuous integration service that compiles source code, run test, and produces software packages that are ready to deploy
- AWS CodeBuild monitors functions on your behalf and reports metrics through Amazon CloudWatch. These metrics include the number of total builds, failed builds, successful builds, and the duration of builds. You can monitor your builds at two levels: Project level, AWS account level. You can export log data from your log groups to an Amazon S3 bucket and use this data in custom processing and analysis, or to load onto other systems.

### CodeDeploy

- An **AppSpec** file must be a YAML-formatted file named appspec.yml and it must be placed in the root of the directory structure of an application's source code.

  The AppSpec file is used to:

  Map the source files in your application revision to their destinations on the instance.

  Specify custom permissions for deployed files.

  Specify scripts to be run on each instance at various stages of the deployment process.





## API Gateway

- After creating your API, you must deploy it to make it callable by your users. To deploy an API, you create an API deployment and associate it with a stage. A stage is a logical reference to a lifecycle state of your API (for example, dev, prod, beta, v2). API stages are identified by the API ID and stage name. Every time you update an API, you must redeploy the API to an existing stage or to a new stage. Updating an API includes modifying routes, methods, integrations, authorizers, and anything else other than stage settings.

## S3

- S3 Object Ownership has two settings: 1. Object writer – The uploading account will own the object. 2. Bucket owner preferred – The bucket owner will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL. Without this setting and canned ACL, the object is uploaded and remains owned by the uploading account.





## AWS Step Function

- AWS Step Functions is a serverless function orchestrator that makes it easy to sequence AWS Lambda functions and multiple AWS services into business-critical applications. AWS Step Functions manages state, checkpoints and restarts for you to make sure that your application executes in order and as expected. Built-in try/catch, retry and rollback capabilities deal with errors and exceptions automatically.
- You should consider AWS Step Functions when you need to coordinate service components in the development of highly scalable and auditable applications. You should consider using Amazon Simple Queue Service (Amazon SQS), when you need a reliable, highly scalable, hosted queue for sending, storing, and receiving messages between services. Step Functions keeps track of all tasks and events in an application. Amazon SQS requires you to implement your own application-level tracking, especially if your application uses multiple queues.
-  Both Amazon EventBridge and Amazon SNS can be used to develop event-driven applications, and your choice will depend on your specific needs. Amazon EventBridge is recommended when you want to build an application that reacts to events from SaaS applications and/or AWS services. Amazon EventBridge is the only event-based service that integrates directly with third-party SaaS partners.
- Amazon SNS is recommended when you want to build an application that reacts to high throughput or low latency messages published by other applications or microservices (as Amazon SNS provides nearly unlimited throughput), or for applications that need very high fan-out (thousands or millions of endpoints).
- A Task state ("Type": "Task") represents a single unit of work performed by a state machine. `Resource` field is a required parameter for `Task` state. 



- A Classic Load Balancer with HTTP or HTTPS listeners might route more traffic to higher-capacity instance types.

- With Application Load Balancers, cross-zone load balancing is always enabled.

- After you disable an Availability Zone, the targets in that Availability Zone remain registered with the load balancer. However, even though they remain registered, the load balancer does not route traffic to them.

- the healthy check type of ASG is changed from EC2 to ELB, Auto Scaling will be able to replace the unhealthy instance.

- Status Check by default only cover EC2 instance's health. 

- The **X-Forward-For** request header helps you identity the IP address of a client when you use an HTTP or HTTPS load balancer.

- The **X-Forward-Proto** request header helps you identify the protocol(HTTP or HTTPS) that a client used to  connect to your local balancer.

- Request a website but received a timeout errors usually result by Security Groups.

- A Security Group acts as a virtual firewall at the instance level.

- Query instance metadata at http://169.254.169.254/latest/meta-data

- Cognito User Pool is used to provide authentication for application. while Cognito Identity Pools are use to provide temporary authenticate AWS Service.

- Elastic-Cache is a in-memory data stores in the cloud. broadly, two types of caching strategies:

  - Lazy loading: loads data into the cache only when necessary
  - Write Through: add data or update data in the cache whenever data is written to the database.

- The cache and the backend can not be update at the same time via a single atomic operation as there are two separate systems.

- **`docker login -u $AWS_ACCESS_KEY_ID -p $AWS_SECRET_ACCESS_KEY`** - You cannot login to AWS ECR this way. AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY are only used by the CLI and not by docker.

- **Amazon Elastic Container Service(ECS)**

  - **Fargate**: one is host your cluster on a serverless infrastructure that is managed by Amazon ECS by launching your service or tasks using the Fargate launch type.

    when should put multiple container in the same task definition:

    - Containers share a common lifecycle
    - Containers are required to be run on the same underlying host
    - you want containers to share resources
    - your containers share data volumes.

  - **EC2 Instance**: host tasks on a cluster of Amazon Elastic Compute Cloud(EC2) instance that you manage by using the EC2 launch type.

- EBS can be encrypted and attach it to a supported instance type. EBS volume support both in-flight encryption and encryption at rest using KMS.  the following types of data are encrypted:

  - Data at rest inside the volume
  - All data moving between the volume and the instance
  - All snapshots created from the volume
  - All volumes created from those snapshot.

- **AWS Glue** is a fully managed extract, transform and load(ETL) service that make it easy for customers to prepare and load their data for analytics.

- CloudWatch integration with S3 doesn't need any other things to process
- **Use Secrets Manager ** - AWS Secrets Manager enables you to easily rotate, manage, and retrieve database credentials, API keys, and other secrets throughout their lifecycle
- **AWS CloudTrail** is a service provided by AWS that enables you to monitor and log account activity and events across your AWS infrastructure.
- **AWS CloudWatch** allows you to monitor AWS cloud resources and the application you run on AWS
- **VPC Flow Logs** is a feature that enables you to capture information about the IP traffic going to and from network interfaces in your VPC.
- **AWS Systems Manager Parameter Store(SSM Parameter Store)** provides secure, hierarchical storage for configuration data management and secrets management.
- **AWS Key Management Service(KMS)** makes it easy for you to create and manage cryptographic keys and control their use across a wide range of AWS services and in your application.
- **AWS CloudFormation StackSets** extends the capability of stacks by enabling you to create, update or delete stacks across multiple accounts and AWS Region with a single operation.
- AWS Cloud Development Kit(**CDK**) is a framework for defining cloud infrastructure in code and provisioning it through AWS CloudFormation. The CDK poses regional limitation.
- AWS Organizations is an account management service that enables you to consolidate multiple AWS accounts into an organization that you create and centrally manage.
- when use AWS CLI and the region parameter is not set, then the CLI command is executed against the default AWS region. so can use --region parameter.
- AWS boto3 is the official AWS SDK(Software Development Kit) for python. it allows developers to interact with various AWS services and resources programmatically using python code.
- Exported Output Values in CloudFormation must have a unique names within a single region.
- Amazon S3 server-side encryption uses one of the strongest block ciphers available to encrypt data, which is AES-256

```json
{
  "Version": "2012-10-17",
  "Id": "PutObjectPolicy",
  "Statement": [
    {
      "Sid": "DenyIncorrectEncryptionHeader",
      "Effect": "Deny",
      "Principal": "*",
      "Action": "s3:PutObject",
      "Resource": "arn:aws:s3:::DOC-EXAMPLE-BUCKET/*",
      "Condition": {
        "StringNotEquals": {
          "s3:x-amz-server-side-encryption": "AES256"
        }
      }
    },
    {
      "Sid": "DenyUnencryptedObjectUploads",
      "Effect": "Deny",
      "Principal": "*",
      "Action": "s3:PutObject",
      "Resource": "arn:aws:s3:::DOC-EXAMPLE-BUCKET/*",
      "Condition": {
        "Null": {
          "s3:x-amz-server-side-encryption": "true"
        }
      }
    }
  ]
}
```

- **Access Advisor feature on IAM console** - to help identify the unused roles, IAM reports the last-used timestamp that represents when a role was last used to make an AWS request.

- **AWS Trusted Advisor** is an online tool that provides you real-time guidance to help you provision your resources following AWS best practices on cost optimization, security, fault tolerance, service limits and performance improvement.

- **IAM Access Analyzer** helps you identify the resources in your organization and accounts, such as Amazon S3 buckets or IAM role. that are shared with an external entity. this lets you identify unintended access to your resources and data, which is a security risk

- **AWS Inspector** is an automated security assessments service that helps improve the security and compliance of applications deployed on AWS.

- In IAM, a principal is a person or application that can make a request for an action or operation on an AWS resource. the principal is authenticated as the AWS account root user or an IAM entity to make requests to AWS.

- IAM username and password credentials cannot be used to access CodeCommit.

- **Deploy using 'Immutable' deployment policy** - A slower deployment method, that ensures your new application version is always deployed to new instances, instead of updating existing instances. It also has the additional advantage of a quick and safe rollback in case the deployment fails. With this method, Elastic Beanstalk performs an immutable update to deploy your application. In an immutable update, a second Auto Scaling group is launched in your environment and the new version serves traffic alongside the old version until the new instances pass health checks.

- **AWS Certificate Manager(ACM)**  is the preferred tool to provision, manage, and deploy server certificates.  With ACM you can request an certificate or deploy an existing ACM or external certificates to AWS resources. Certificates provided by ACM are free and automatically renew.

- **IAM** - IAM is used as a certificate manager only when you must support HTTPS connections in a Region that is not supported by ACM. IAM securely encrypts your private keys and stores the encrypted version in IAM SSL certificate storage. IAM supports deploying server certificates in all Regions, but you must obtain your certificate from an external provider for use with AWS. You cannot upload an ACM certificate to IAM. Additionally, you cannot manage your certificates from the IAM Console.

- **Kinesis**`ProvisionedThroughputExceededException` indicates that the request rate for the stream is too high, or the requested data is too large for the available throughput. Reduce the frequency or size of your requests.

- **Network Load Balancer(NLB)** supports assigning elastic IP.

- **CNAME records** can be used to map one domain name to another

- **PTR Record** resolves an IP address to a fully-qualified domain name as an opposite wo what A reocrd does.

- Alias records let you route traffic to selected AWS resources, such as CloudFront distributions and Amazon S3 buckets. they also let you route traffic from one record in a hosted zone to another record.

-  You can enable API caching in Amazon API Gateway to cache your endpoint's responses. With caching, you can reduce the number of calls made to your endpoint and also improve the latency of requests to your API.

- Which of the following best describes how KMS Encryption works?

  - KMS stores the CMK, and receives data from the clients, which it encrypts and sends back

- **Cognito Sync** is an AWS service and client library that enables cross-device syncing of application-related use data

- AWS Budgets lets customers set custom budgets and receive alerts if their costs or usage exceed(or are forecasted to exceed) their budget amount. While AWS require approximately 5 weeks of usage data to generate budget forecast. if you set a budget to alert based on a forecast amount, this budget alert isn't triggered until you have enough historical usage information.

- **RCU** 1KB per seconds per item

- **WCU** 4 KB per seconds per item for strongly consistent read or 2 for eventually consistent  write

- **Delete Queue** Delete the queue specified by the QueueUrl, regardless of the queue's contents, when you delete a queue, any messages in the queue are no longer available. when you delete a queue, you must wait 60s before creating a queue with the same name.

- **Purge Queue** will deletes the messages but keep the queue existed.

- Elastic Beanstalk deployment policy:

  - All at once
  - Rolling
  - Rolling with additional batch
  - Immutable - A slower deployment method, that ensure your new application version is always deployed to new instance, instead of updating existing instance, it also has additional advantage of quick and safe rollback in case the deployment fails.
  - Traffic splitting - canary test.
  - Immutable and canary test will lead to burst credit reset to zero.

- **ALB access logs** - Elastic Load Balancing provides access logs that capture detailed information about requests sent to your load balancer. Each log contains information such as the time the request was received, the client's IP address, latencies, request paths, and server responses. You can use these access logs to analyze traffic patterns and troubleshoot issues. Access logging is an optional feature of Elastic Load Balancing that is disabled by default.

- IAM policy is a object that can be associated with a Identity or Resource.

- **Trust policy** define which principal entities(accounts, users, role and federated users) can assume the role. The IAM service supports only one type of resource-based policy called a role trust policy, which is attached to an IAM role.

- **Access Control List(ACL)** are service policies that allow you to control which principals in another account can access a resource.

- **Docker Volume** are only supported when running tasks on Amazon EC2 instances.

- Bind mounts host volumes are supported for tasks hosted on Fargate or Amazon EC2 instances. but only provides temporary storage.

- Any resources created as part of your `.ebextensions` is part of your Elastic Beanstalk template and will get deleted if the environment is terminated.

- Auto Scaling groups cannot span across multiple Regions

- For Amazon CloudFront, key pairs can be used to sign URLs for private content, such as when you want to distribute restricted content that someone paid for. IAM users can't create CloudFront key pairs, you must log in using root credentials to create key pairs.

- **Signature version 4** is the process to add authentication information to AWS requests sent by HTTP.

- Lambda Authorizer An Amazon API Gateway Lambda authorizer (formerly known as a custom authorizer) is a Lambda function that you provide to control access to your API. A Lambda authorizer uses bearer token authentication strategies, such as OAuth or SAML

  

- **CodePipeline** automates the build, test, and deploy phases of your release process every time there is a code change. CodePipeline itself cannot deploy applications.

- **CodeDeploy** is a fully managed deployment service that automate software deployments to a variety of compute services such as Amazon EC2, AWS Fargate, AWS lambda and your on-premises servers. AWS CodeDeploy makes it easier for you to rapidly release new features, help you avoid downtime during application deployment and handles the complexity of updating your applications.

- **Load Balancer** communicates with the underlying EC2 instances using their private IPs and Load Balancer can target EC2 instances only within an AWS Region

- when creating configuration files for AWS Elastic Beanstalk should obey naming convention **`.ebextensions/<mysettings>.config`**

- **S3 Object Lock** enables you to store objects using a write once read many model. can help prevent accidental or inappropriate deletion of data.

- **NACL(Network Access Control List)** is a security feature in Amazon Web Services that acts as a virtual firewall for controlling inbound and outbound traffic at the subnet level.

- **Security Group** is a fundamental security feature in Amazon Web Services that acts as a virtual firewall for controlling inbound and outbound traffic to and from Amazon EC2 instances.

- **SAM supports the following resource types**

  - AWS::Serverless::Api

    AWS::Serverless::Application

    AWS::Serverless::Function

    AWS::Serverless::HttpApi

    AWS::Serverless::LayerVersion

    AWS::Serverless::SimpleTable

    AWS::Serverless::StateMachine

- **"s3:x-amz-server-side-encryption":"aws:AES256"**  is used for S3-managed encryption keys. **"s3:x-amz-server-side-encryption":"aws:kms"** is used for server-side encryption with SSE-KMS

- **AWS Marketplace** enables qualified partners to market and sell their software to AWS Customers.

- **AWS AppSync** is a fully managed service that makes it easy to develop GraphQL APIs by handling heavy lifting of securely connecting to data sources like AWS DynamoDB, Lambda, and more.

- **AWS Service Catalog**  allows organizations to create and manage catalogs of IT services that are approved for use on AWS.

- **AWS serverless Application Repository(SAR)** is a managed repository for serverless application. It enables teams, organizations, and individual developers to store and share reusable applications, and easily assemble and deploy serverless architectures in powerful new ways.

- **Amazon Cognito Sync** is an AWS service and client library that enables cross-device syncing of application-related data. you can use it to synchronize user profile data across mobile device and web without requiring your own backend.

- A **route table** contains a set of rules, called route, that are used to determine where network traffic from your subnet or gateway is directed, a subnet is always associated with some route table and can be associated with one route table at a time.

- when ASG finds that an instance is unhealthy, it terminates that instance and launches a new one.

- **CloudFront signed cookies** allow you to control who can access your content when you don't want to change your current URLs or when you want to provide access to multiple restricted files, for example, all of the files in the subscribers' area of a website

-  **AWS WAF** is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to CloudFront, and lets you control access to your content. Based on conditions that you specify, such as the values of query strings or the IP addresses that requests originate from, CloudFront responds to requests either with the requested content or with an HTTP status code 403 (Forbidden). A firewall is optimal for broader use cases than restricted access to a single file.

- **CloudFront's field-level encryption** further encrypts sensitive data in an HTTPS form using field-specific encryption keys (which you supply) before a POST request is forwarded to your origin. This ensures that sensitive data can only be decrypted and viewed by certain components or services in your application stack. 

- Here is the correct way of **reusing SSH keys** in your AWS Regions:

  1. Generate a public SSH key (.pub) file from the private SSH key (.pem) file.
  2. Set the AWS Region you wish to import to.
  3. Import the public SSH key into the new Region.

- **AWS EMR (Elastic MapReduce)** is a fully managed big data processing service offered by Amazon Web Services (AWS). It provides a scalable and cost-effective solution for processing and analyzing large amounts of data using popular open-source frameworks such as Apache Hadoop, Apache Spark, Apache Hive, and more.
  - **Use AWS Data Pipeline to export your table to an S3 bucket in the account of your choice and download locally** - This is the easiest method. This method is used when you want to make a one-time backup using the lowest amount of AWS resources possible. Data Pipeline uses Amazon EMR to create the backup, and the scripting is done for you. You don't have to learn Apache Hive or Apache Spark to accomplish this task.
  - **Use Hive with Amazon EMR to export your data to an S3 bucket and download locally** - Use Hive to export data to an S3 bucket. Or, use the open-source emr-dynamodb-connector to manage your own custom backup method in Spark or Hive. These methods are the best practice to use if you're an active Amazon EMR user and are comfortable with Hive or Spark. These methods offer more control than the Data Pipeline method.
  - **Use AWS Glue to copy your table to Amazon S3 and download locally** - Use AWS Glue to copy your table to Amazon S3. This is the best practice to use if you want automated, continuous backups that you can also use in another service, such as Amazon Athena.

