import os

os.system('mkdir output')
os.system('javac ./src/*.java -d ./output')

os.system('java -cp ./output Analyser Insertion')
os.system('py ./src/plotter.py')