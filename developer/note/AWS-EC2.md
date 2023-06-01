# AWS

## EC2

### Security Group

whenever trying to connect an EC2 instance but got a 'time out', this is 100% caused by a security group issue.

### Important Port

- 22 = SSH (Secure Shell) - log into a Linux instance
- 21 = FTP (File Transfer Protocol) - upload files into a file share
- 22 = SFTP (Secure File Transfer Protocol) - upload files using SSH
- 80 = HTTP - access unsecured websites
- 443 = HTTPS - access secured websites
- 3389 = RDP (Remote Desktop Protocol) - log into a Windows instance

### Quiz

- EC2 Reserved Instances can be reserved for 1 or 3 years only.

- Storage Optimized EC2 instances are great for workloads requiring high, sequential read/write access to large data sets on local storage.
- Dedicated Hosts are good for companies with strong compliance needs or for software that has complicated licensing models. this is the most expensive EC2 Purchasing Option available

