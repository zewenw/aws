# AWS VPC

## Quiz

- Security Group are stateful and if traffic can go out, then it can go back in
- Amazon S3&DynamoDB have a VPC Gateway Endpoint, all the other ones have an interface endpoint(Powered by Private Link - means a private IP).

**Q** : A web application hosted on a fleet of EC2 instances managed by an Auto Scaling Group. You are exposing this application through an Application Load Balancer. Both the EC2 instances and the ALB are deployed on a VPC with the following CIDR `192.168.0.0/18`. How do you configure the EC2 instances' security group to ensure only the ALB can access them on port **80**?

**A**: Add a Inbound Rule with port 80 and ALB's Security Group as the source.

