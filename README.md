# Run Agent Service

In order to run the Agent Service locally follow the next steps:

1. Download and install Docker Desktop for Windows.
2. Install Couchbase Server Image Using Docker. Run Couchbase Image on localhost.
3. Add Bucket **agent**. Create a user that can perform operations on the created bucket.
4. Create an index to allow the application to search for agents.
```
CREATE PRIMARY INDEX `#primary` ON `agent`
```
5. Run Agent Service.