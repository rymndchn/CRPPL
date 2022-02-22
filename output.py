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
#entering assignment
tmp_result = sales[["TotalProfit"]]
grouped = sales
tmp_result = grouped.agg({"TotalProfit":"mean"})
print(tmp_result)
sales_mean=grouped.agg({"TotalProfit":"mean"})
sales_mean = sales_mean.tolist()[0]
# i am checking line

#exiting assignment
# i am checking line
#entering assignment
data_count = 100
#exiting assignment
# i am checking line
