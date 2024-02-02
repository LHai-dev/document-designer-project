// routes/users.js
const express = require('express');
const router = express.Router();

// In-memory array to store user data
let users = [];

// Create a new user
router.post('/', (req, res) => {
  const newUser = req.body;
  users.push(newUser);
  res.status(201).json(newUser);
});

// Read all users
router.get('/', (req, res) => {
  res.json(users);
});

// Read a specific user by ID
router.get('/:id', (req, res) => {
  const userId = parseInt(req.params.id);
  const user = users.find((u) => u.id === userId);

  if (user) {
    res.json(user);
  } else {
    res.status(404).send('User not found');
  }
});

// Update a user by ID
router.put('/:id', (req, res) => {
  const userId = parseInt(req.params.id);
  const updatedUser = req.body;

  users = users.map((user) => (user.id === userId ? updatedUser : user));

  res.json(updatedUser);
});

// Delete a user by ID
router.delete('/:id', (req, res) => {
  const userId = parseInt(req.params.id);
  users = users.filter((user) => user.id !== userId);
  res.send('User deleted successfully');
});

module.exports = router;