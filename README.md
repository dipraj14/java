
## Database Procedures

**Blog Procedures**

**1. CreatePosts**

- Creates a new blog post.

- **Usage Example:** 
```javascript
CALL CreatePosts('My First Post', 'This is my first post', 'Abhishek Kumar', @pid);
```
**2. GetAllPosts**

- Retrieves all blog posts.

- **Usage Example:** 
```ruby
CALL GetAllPosts();
```
**3. GetPostByPostId**

- Retrieves a specific blog post by postId.

- **Usage Example:** 
```ruby
CALL GetPostByPostId(1);
```
**3. UpdatePostByPostId**

- Updates a blog post by postId.

- **Usage Example:** 
```ruby
CALL UpdatePostByPostId(1, 'Updated Title', 'Updated Description', 'New Author');
```
**4. DeletePostByPostId**

- Deletes a blog post by postId.

- **Usage Example:** 
```ruby
CALL DeletePostByPostId(1);
```
**User Procedures**

**1. GetAllUsers**

- Retrieves all user records.

**Usage Example:** 
```ruby
CALL GetAllUsers();
```
**2. ValidateAndInsertUser**

- Validates and inserts a new user.

- **Usage Example:** 
```ruby
CALL ValidateAndInsertUser('Abhishek', 'Kumar', 'abhishek.yashyap@gmail.com', '9529745533', '', @id);
```

Include appropriate information on how to call these procedures and what parameters they require. Adjust the examples based on your specific data and use cases.

