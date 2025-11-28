# Security Configuration

## Authentication Credentials
- **Username:** `admin`
- **Password:** `SecureAdmin@2024`

## Rate Limiting
- **Limit:** 20 requests per minute per IP address
- **Response:** 429 Too Many Requests (when exceeded)

## Protected Endpoints (Require Authentication)
- POST `/api/users` - Create user
- PUT `/api/users/{id}` - Update user
- DELETE `/api/users/{id}` - Delete user

## Public Endpoints (No Authentication Required)
- GET `/api/users` - Get all users
- GET `/api/users/{id}` - Get user by ID
- GET `/health` - Health check
- GET `/` - Home page

## Testing Authentication
```bash
# Without authentication (will fail)
curl -X POST https://springboot-app.kygozf.easypanel.host/api/users \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Test","lastName":"User","email":"test@example.com"}'

# With authentication (will succeed)
curl -X POST https://springboot-app.kygozf.easypanel.host/api/users \
  -u admin:SecureAdmin@2024 \
  -H "Content-Type: application/json" \
  -d '{"firstName":"Test","lastName":"User","email":"test@example.com"}'
```

## Testing Rate Limiting
```bash
# Run this command 25 times rapidly
for i in {1..25}; do
  curl https://springboot-app.kygozf.easypanel.host/api/users
  echo ""
done
# After 20 requests, you'll get: "Too many requests. Please try again in X seconds."
```

## Validation Rules
- **firstName:** Required, 2-50 characters
- **lastName:** Required, 2-50 characters
- **email:** Required, must be valid email format
