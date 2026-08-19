import requests

# Configuration
JENKINS_URL = "http://localhost:8080"
USER = "lokashakthivelsp"
API_TOKEN = "115a8f5a9cc6faef2c161a350cd4d72fcf"
JOB_NAME = "external-trigger"
SECRET_TOKEN = "MySecretJobToken123"

# Endpoint URL
url = f"{JENKINS_URL}/job/{JOB_NAME}/build?token={SECRET_TOKEN}"

# Trigger build
response = requests.post(url, auth=(USER, API_TOKEN))

if response.status_code == 201:
    print("Build triggered successfully!")
else:
    print(f"Failed to trigger build. Status code: {response.status_code}")
