# AWS-EC2 Instance Storage

## Snapshot Hands-on

### Recover Data from a Volume which was created by a snapshot

first I created a snapshot from a volume then create a new volume based on the snapshot, and then I attached this volume to a new instance which is in another availability zone, but after I use the 'lsblk' command to check the EBS, I found the mount status still there

![image-20230416144950379](C:\Users\t1551\AppData\Roaming\Typora\typora-user-images\image-20230416144950379.png)

so the first step should umount the EBS with the original mount directory. then re-mount to another directory. After all these steps, the data can be recovered.

` sudo umount /mnt/ebs`
` sudo mount /dev/xvdf /mnt/re` 

#### EC2 Multi-Attach Feature

only io/io2 family EBS can be attached to multiple EC2 instances, but these EC2 instances should be in one availability zone.



### EFS - Elastic File System

- EFS work with EC2 instances in multi-AZ
- can be mounted on many EC2

### Quiz

- EBS Volume is created for a specific AZ, it is possible to migrate them between different AZs using an EBS snapshot
- For EBS gp2 volumes, it has max IOPS of 16000 or equivalent 5334GB
- EFS is an network file systems(NFS) that allows you to mount the same file systems on EC2 instances that are in different AZs
- EC2 instance store provides the best disk I/O performance.
- 256000 is the maximum IOPS you can achieve when you're using the EBS io2 Blocks Express volume type

Q: You are running a high-performance database that requires an IOPS of 310,000 for its underlying storage. What do you recommend?

A: Use an EC2 Instance Store

You can run a database on an EC2 instance that uses an Instance Store, but you'll have a problem that the data will be lost if the EC2 instance is stopped (it can be restarted without problems). One solution is that you can set up a replication mechanism on another EC2 instance with an Instance Store to have a standby copy. Another solution is to set up backup mechanisms for your data. It's all up to you how you want to set up your architecture to validate your requirements. In this use case, it's around IOPS, so we have to choose an EC2 Instance Store.