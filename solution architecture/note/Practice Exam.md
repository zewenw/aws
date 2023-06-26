# Practice Exam

- **RDS Custom** managed Oracle and Microsoft SQL Server Database with OS and database customization

# Storage

- **ElastiCache** doesn't support IAM Auth
- **AWS Glue** is a fully managed extract, transform and load(ETL) service that makes it easy for customers to prepare and load their data for analytics.
- **AWS EMR(Elastic MapReduce）** is the industry-leading cloud big data platform for processing vast amounts of data using open source tools such as Apache Spark, Apache Hive etc.
- **AWS Database Migration Service** helps you migrate databases to AWS quickly and securely.
- **AWS Neptune** is a fast, fully managed graph database service that makes it easy and run applications that work with highly connected datasets.

## S3

- **AWS S3** delivers strong read-after-write consistency automatically, after a successful write of a new object or a overwrite of an existing object, any subsequent read request immediately receives the latest version of the object. to summarize, all S3 GET, PUT and LIST operations, as well as operations that change object tags, ACLs or metadata, are strongly consistent.
- **S3 Transfer Acceleration** is a bucket-level feature that enables fast, easy and secure transfers of files over long distances between your client and an S3 bucket.
- **Bucket Policy** can be used to grant users within your AWS account or other AWS accounts(i.e., Cross-Account Permission) access to your amazon S3 resources.  while using **IAM Policies** can only grant users within your own AWS account permission to access your Amazon S3 resources.
- **Amazon S3 Transfer Acceleration** enables fast, easy and secure transfers of files over long distances between your clients and an S3 bucket.
- **Amazon Redshift** if a fully managed, petabytes-scale data warehouse service in the cloud.

# VPC&NetWork

- **VPC Sharing** (part of Resource Access Manager) allows multiple AWS accounts to create their application resources into shared and centrally-managed Amazon Virtual Private Cloud(VPCs). To set this up, the account that owns the VPC (owner) shares one or more **subnets** with other accounts (participants) that belong to the same organization from AWS Organizations.
- **VPC Peering** connection is a networking connection between two VPCs that enables you to route traffic between them using private IPV4 address or IPV6 address. instances in either VPC can communicate with each other as if they are within the same network. VPC peering does not facilitate centrally managed VPCs.
- **The Amazon VPC console** wizard provides four configurations:
  - VPC with a single public subnet
  - VPC with public and private subnet
  - VPC with public and private subnets and AWS Site-to-Site VPN access
  - VPC with a private subnet and AWS Site-to-Site VPN access
- **AWS Snow Family** Highly-secure, portable devices to collect and process data at the edge, and migrate data into and out of AWS
  - Data migration: Snowcone, Snowball Edge, Snowmobile
  - Data computing: Snowcone, Snowball Edge

- **NLB** routing mechanism
  - Routing based on instanceID: if specify targets using an instance ID, traffic is routed to instance using the primary private IP address specified in the primary network interface for the instance
  - Routing based on IP address: if you specify targets using IP address, traffic is routed to an instance using any private IP address from one or more network interfaces.
- **VPC CloudHub** provides secure communication between multiple sites, if you have multiple VPN connections
- **NAT Instance VS NAT Gateway**
  - NAT instances support port forwarding, can be associated with a NAT instance, can be used as bastion server.
  - NAT Gateway doesn't support these features
- **AWS Global Accelerator** is a service that improves the availability and performance of your application with local or global users
- **CloudFront** supports HTTP/RTMR protocol based requests. **AWS Global Accelerator** is a good fit for non-http use cases, such as gaming(UDP), IoT(MQTT) or Voice over IP.
- **A VPC endpoint** enables you to privately connect your VPC to supported AWS services and VPC endpoint services powered by AWS privatelink without requiring an internet gateway, NAT device, VPN connection, or AWS Direct Connect connection, instances in your VPC do not require public IP addresses to communicate with resources in the service, traffic between your VPC and the other service does not leave the Amazon network
  - **An Interface Endpoint(Elastic Network Interface ENI)** with a private IP address from the IP address range of your subnet that serves as an entry point for traffic destined to a supported service
  - **A Gateway Endpoint** is a gateway that you specify as a target for a route in your route table for tarffic destined to a supported AWS service, the following AWS services are supported: Amazon S3 and DynamoDB.

# EC2

- **Dedicated Hosts** enables you to use your existing server-bound software licenses. Dedicated instances cannot be used for existing server-bound licenses.
- **Launch Configuration** is an instance configuration template that an Auto Scaling group uses to  launch EC2 instances. when you create a launch configuration, you specify information for the instances. include the ID of the Amazon Machine Image(AMI), the instance type, a key pair, one or more security groups, and a block device mapping. it is not possible to modify a launch configuration once it it created.
- Using IAM role to manage temporary credentials for applications that run on an EC2 instance is best practice.
- **Placement Groups**
  - Cluster: Pro: great network, Cons: if the rack fails, all instances fails at the same time
  - spread: 
    - Pro:
      - can span across AZ
      - reduced risk is simultaneous failure
      - EC2 instances on different physical hardware
    - Con: Limited to 7 instances per AZ per placement group
  - Partition: 
    - Up to 7 partitions per AZ
    - Can span across multiple AZs in the same region
    - up to 100s EC2 instance
    - The in stances in a partition do not share racks with the instances in the other partition
- **CloudWatch** alarm actions, can create alarm that automatically stop, terminate, reboot or recover your EC2 instances.

# SQS&SNS

- **Amazon Simple Queue Service** offers two types of message. Standard Queue offer maximum throughput, best-effort ordering, and at-least-once delivery, SQS FIFO are designed to guarantee that messages are proceed exactly once, in the exact order that they are sent. by default, FIFO queues support up to 3000 messages per second with batching or up to 300 messages per second without batching. the name of FIFO queue must end with .fifo suffix. standard queue can not be converted to FIFO.

# Other Service

- **Amazon GuardDuty** is a intelligent threat discovery to protect your AWS Account, uses machine learning algorithms, anomaly detection, 3rd party data, input data includes: CloudTrail Event Logs, VPC Flow Logs, DNS logs and Optional Features.
- **Amazon Macie** is a fully managed data security and data privacy service that uses machine learning and pattern matching to discover and protect your sensitive data in AWS.
- **AWS Simple Notification Service(SNS)** is a highly available durable, secure, fully managed pub/sub messaging service that enables you to decouple microservices, distributed systems, and serverless application.
- **AWS Cost Explorer** helps you identify under-utilized EC2 instances that may be downsized on an instance by instance basis within the same instance family, and also understand the potential impact on your AWS bill by taking into account your Reserved instances and Saving plans
- **AWS Computer Optimizer** helps you choose the optimal Amazon EC2 instance types, including those that are part of an Amazon EC2 Auto Scaling group, based on your utilization data.
- **AWS DataSync** is an online data transfer service that simplifies, automates, and accelerates copying large amounts of data between on-premises storage systems and AWS storage services, as well as between AWS Storage services.

