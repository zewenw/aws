# AWS

## IAM

- IAM Credentials report lists all your AWS Account's IAM Users and the status of their various credentials.
- IAM User Groups can contain only IAM Users.
- A statement in an IAM Policy consists of Sid, Effect, Principal, Action, Resource, and Condition. Version is part of the IAM Policy itself, not the statement.

### What is AWS Shared Responsibility Model

The AWS Shared Responsibility Model is a framework that defines the security responsibilities of AWS and its customers. The model helps to ensure that there is clarity about the security controls and processes in place to protect AWS services and the customer's data.

In this model, AWS is responsible for the security of the underlying infrastructure, including the physical security of data centers, hardware, and network infrastructure. AWS is also responsible for managing the virtualization layer, including the hypervisor and guest operating system, as well as the security configuration of managed services.

Customers, on the other hand, are responsible for the security of their own applications and data that they store on the AWS infrastructure. This includes the security of their operating systems, applications, and data. Customers are also responsible for managing access to their AWS resources, including identity and access management (IAM), network security, and encryption.

In summary, AWS and its customers share the responsibility for security in the cloud. By defining the areas of responsibility, the AWS Shared Responsibility Model helps customers to understand the security controls they need to implement to protect their data and applications on the AWS platform.