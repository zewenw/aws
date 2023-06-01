# AWS Fundamentals: ELB + ASG

## ELB(Elastic Load Balancer)

- ALB: Application Load Balancer
- NLB: Network Load Balancer
- GLB: Gateway Load balancer

## ASG (Auto Scaling Group)

- Scale out (add EC2 instance) to match an increased load
- Scale in (remove EC2 instance) to match a decreased load
- Ensure we have a minimum and a maximum number of EC2 instances running
- Automatically register new instances to a load balancer
- Re-create an EC2 instance in case a previous one is terminated(ex: if unhealthy)

#### Auto Scaling - Instance Refresh

- Goal: update launch template and then re-creating all EC2 instances.(can be used for software upgrade releases)

### Quiz

- Elastic Load Balancers provides a static DNS name we can use in our application

: Only Network Load Balancer provides both static DNS name and static IP, while, Application Load Balancer provides a static DNS name but it does not provide a static IP, the reason being that AWS wants your Elastic Load Balancer to be accessible using a static endpoint, even if the underlying infrastructure that AWS manages changes.

- When you enable ELB healthy checks, your ELB won't send traffic to unhealthy(crashed) EC2 instances.
- Application Load Balancers support the HTTP, HTTPS, WebSocket, Except TCP.
- Cookie name are reserved by the ELB(AWSALB, AWSALBAPP, AWSALBTG)