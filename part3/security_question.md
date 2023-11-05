## Uber solar panels

As a head of Engineering for Uber solar panels app it is very important that I audit the app's infrastructure, because securing it is crucial to protect customer data and ensure the reliability of our service. Based on OWASP Top 10 for 2021, here are my specific security considerations for our infrastructure:

- Implement multi-factor authentication (MFA) and session management to prevent unauthorized access to customer information for our mobile applications and our web frontend.
- Start protecting customer information stored in the MySQL database using encryption techniques to secure the data in transit and at rest.
- Implement password hashing to protect protect all the passwords in the database and stop storing them as plain text.
- Ensure that our FastAPI backend is secure by implementing token-basesd authentication, also use validation and sanitization for inputs, and employ rate limiting into the number of API calls the client can do.
- Implement a zero trust policy to never trust our systems and always be verifying them.
- Regularly audit and review our Kubernetes containers, AWS configurations, and application settings to ensure they are not exposing sensitive information or vulnerabilities.
- Review and enforce proper access control for our system, making sure that our engineers don't have full access to the databases and making sure customer support employees and sales employees, only have access to the data and features they need to perform their tasks. Implement role-based access control (RBAC) to restrict access.
- Implement Amazon CloudWatch to make sure that our systems logs security-relevant events and regularly reviews the logs for signs of suspicious activities or potential breaches. Set up alerts and notifications to respond promptly to security incidents.
