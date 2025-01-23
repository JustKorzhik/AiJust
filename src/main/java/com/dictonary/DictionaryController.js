const express = require('express');
const app = express();
const port = 3000;

const dictionary = {
    "key1": "value1",
    "key2": "value2",
    "key3": "value3"
};

app.get('/api/get-value', (req, res) => {
    const content = req.query.content;
    if (dictionary[content]) {
        res.send(dictionary[content]);
    } else {
        res.send("Key not found");
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
