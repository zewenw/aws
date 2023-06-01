# AWS ECS, ECR &  Fargate - Docker in AWS

## ECR (Amazon Elastic Container Registry)

- Private Repository

## ECS (Amazon Elastic Container Service)

## EKS (Amazon Elastic Kubernetes Service)

## AWS Fargate 

- Amazon's own serverless container platform
- Works with ECS and with EKS

## Quiz

- ECS Task Role is the IAM Role used by the ECS task itself, Use when your container wants to call other AWS services like S3, SQS, etc.

- EC2 Instance Store can't be shared between different EC2 instances.

- EFS volume can be shared between different EC2 instances and different ECS tasks. it can be used as a persistent multi-AZ shared storage for containers.

- Any permissions issues against ECR are most likely due to IAM permissions.

- To enable random host port, set host port = 0 (or empty), which allows multiple containers of the same type to launch on the same EC2 container instance.

- you want to pull Docker Images from a private ECR repository, which AWS CLI command can you use?

  ` $(aws ecr get-login --no-include-email)` 
  
  `docker pull $ECR_IMAGE_URL`