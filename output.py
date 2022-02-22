import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

varFileName = 'CRPPL/CSV Files/source/1000 - Sales Records.csv'
# i am checking line
varDataSetName = 'CRPPL/CSV Files/target/sales.csv'
# i am checking line
source = r'CRPPL/CSV Files/source/1000 - Sales Records.csv'
target = r'CRPPL/CSV Files/target/sales.csv'
shutil.copyfile(source,target)
sales = pd.read_csv('CRPPL/CSV Files/target/sales.csv')

# i am checking line
tmp_result = sales[["UnitsSold"]]
grouped = sales
tmp_result = grouped.agg({"UnitsSold":"mean"})
print(tmp_result)
# i am checking line
#inside grouping isTrue
#insissdfdfdsTrue
print(sales.plot.bar())
plt.xlabel('rating')
plt.ylabel('gross')
plt.savefig('Report/bar.pdf',bbox_inches='tight')
# i am checking line
