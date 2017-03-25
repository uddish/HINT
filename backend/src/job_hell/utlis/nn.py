from __future__ import division, print_function, absolute_import
import tflearn
from tflearn.layers.core import dropout,activation,input_data,utils,fully_connected
from tflearn.layers.estimator import regression
import json
import numpy as np

def predict(data):
	
	input_layer = tflearn.input_data(shape=[None, 20])
	dense1 = tflearn.fully_connected(input_layer, 128, activation='relu')
	dropout1 = tflearn.dropout(dense1, 0.8)
	dense2 = tflearn.fully_connected(dropout1, 32, activation='relu')
	dropout2 = tflearn.dropout(dense2, 0.8)
	softmax = tflearn.fully_connected(dropout2, 2, activation='softmax')
	sgd = tflearn.SGD(learning_rate=0.1, lr_decay=0.96, decay_step=1000)
	top_k = tflearn.metrics.Top_k(3)
	net = tflearn.regression(softmax, optimizer='adam',loss='categorical_crossentropy')
	model = tflearn.DNN(net)
	model.load("/home/vasu/HINT/backend/src/job_hell/utlis/tflearn_nn.model")
	
	x = json.loads(data)
	temp = []
	for ix in x:
		temp.append(float(x[ix]))
	
	dum = np.array(temp)
	dum = dum.reshape(1,20)
	y = model.predict_label(dum)
	return np.argmax(y)	