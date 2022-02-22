import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

varFileName = 'CRPPL/CSV Files/source/1000 - Movie Reviews.csv'
# i am checking line
varDataSetName = 'CRPPL/CSV Files/target/movies.csv'
# i am checking line
source = r'CRPPL/CSV Files/source/1000 - Movie Reviews.csv'
target = r'CRPPL/CSV Files/target/movies.csv'
shutil.copyfile(source,target)
movies = pd.read_csv('CRPPL/CSV Files/target/movies.csv')

# i am checking line
#entering assignment
notXResult = getrating
#exiting assignment
# i am checking line
