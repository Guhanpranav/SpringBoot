<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>
    <h1>Banking Application - Login</h1>

    <!-- Login Form -->
    <form action="/api/user/log-in" method="post">
        <label for="phNo">Phone Number:</label>
        <input type="text" id="phNo" name="phNo" pattern="[0-9]{10}" required>
        <small>Enter a valid 10-digit phone number</small>
        <br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br><br>

        <button type="submit">Login</button>
    </form>
</body>
</html>