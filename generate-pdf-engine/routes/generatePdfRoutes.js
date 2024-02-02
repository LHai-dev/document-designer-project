const express = require('express');
const router = express.Router();
const fs = require('fs');
const carbone = require('carbone');

router.post('/', (req, res) => {

  const { v4: uuidv4 } = require('uuid');

  // Generate a version 4 (random) UUID
  const uuid = uuidv4();

  console.log('Generated UUID:', uuid);


    const data = req.body;
    console.log(data);

    carbone.render('./node_modules/carbone/examples/Project-proposal.odt', data, function(err, result){
        if (err) {
          return console.log(err);
        }
        fs.writeFileSync(uuid+'result.odt', result);
    });

    res.status(201).json(data);
});

module.exports = router;