import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

varFileName = 'CRPPL/CSV Files/source/1000 - Movie Reviews.csv'
varDataSetName = 'CRPPL/CSV Files/target/movies.csv'
source = r'CRPPL/CSV Files/source/1000 - Movie Reviews.csv'
target = r'CRPPL/CSV Files/target/movies.csv'
shutil.copyfile(source,target)
movies = pd.read_csv('CRPPL/CSV Files/target/movies.csv')

#entering assignment
tmp_result = movies[movies["rating"]!='X']
grouped = tmp_result.groupby(["rating"])
__________GROUPED_IS = True
tmp_result = grouped.agg({"gross":"sum"})
print(tmp_result)
notXResult=grouped.agg({"gross":"sum"})

#exiting assignment
#inside grouping isFalse
#insissdfdfdsFalse
print(notXResult.plot.bar())
plt.ticklabel_format(axis='y', style='plain')
plt.xlabel('rating')
plt.ylabel('gross')
plt.savefig('Report/bar.pdf',bbox_inches='tight')
