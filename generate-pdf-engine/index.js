const express = require('express');
const bodyParser = require('body-parser');
const userRoutes = require('./routes/userRoutes');
const pdfRoutes = require('./routes/generatePdfRoutes');

const app = express();
const port = 3000;

app.use(bodyParser.json());

app.use('/users', userRoutes);
app.use('/pdfs', pdfRoutes);

app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
