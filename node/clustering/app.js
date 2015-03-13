/*
 *  Tutorial found @ http://rowanmanning.com/posts/node-cluster-and-express/
 */

// Include Express
var express = require('express');
var cluster = require('cluster');

// Listen for dying workers
cluster.on('exit', function (worker) {
    // Replace the dead worker,
    // we're not sentimental
    console.log('Worker ' + worker.id + ' died :(');
    cluster.fork();
});


// Code to run if we're in the master process
if (cluster.isMaster) {
	// Count the machine's CPUs
	var cpuCount = require('os').cpus().length;

	// Create a worker for each CPU
	for (var i = 0; i < cpuCount; i += 1) {
		cluster.fork();
	}
// Code to run if we're in a worker process
} else {
	// Create a new Express application
	var app = express();

	// Add a basic route – index page
	app.get('/', function (req, res) {
		res.send('Hello from Worker ' + cluster.worker.id);
	});

	// Bind to a port
	app.listen(3000);
	console.log('Worker ' + cluster.worker.id + ' running!');
}