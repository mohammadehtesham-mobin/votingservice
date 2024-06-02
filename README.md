# Cloud Platform Voting Application

This project is a simple web application that allows users to vote for their favorite cloud platforms and view the results.

## Features

- Vote for cloud platforms: AWS, GCP, Azure, OC, IBM
- View voting results in a bar chart format
- Confirmation message after casting a vote

## Technologies Used

- Spring Boot
- Thymeleaf
- HTML/CSS
- JavaScript (Fetch API)

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/cloud-platform-voting.git
   cd cloud-platform-voting
2. Create docker Image or used from below docker hub:
  https://hub.docker.com/r/mohammadehtesham/nagp-voting
  pull Image:
  docker pull mohammadehtesham/nagp-voting
3. Inside k8s folder all the k8s yaml files are available. only prequesties is mounted disk which can be creatred as below in GCP or can be changed to someting else.
  e.g: gcloud compute disks create --size=10GB --zone=us-central1-a nagp-mysql-disk  
## Endpoints
 1. GET /vote  -- Show current status of votes
 2. POST /vote -- cast vote
 3. GET /vote/cast -- get landing page for casting the vote
