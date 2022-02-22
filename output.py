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
profit_mean=grouped.agg({"TotalProfit":"mean"})
profit_mean = profit_mean.tolist()[0]
# i am checking line

#exiting assignment
# i am checking line
#entering assignment
data_count = 100
#exiting assignment
# i am checking line
#entering assignment
counter = 0
#exiting assignment
# i am checking line
def find_upper_profits(profit_mean, data_count, counter, sales):
#entering assignment
	tmp_result = sales[sales["DataId"]==0]
	tmp_result = tmp_result[["TotalProfit"]]
	print(tmp_result)
	current_profit = tmp_result.values.tolist()[0][0]
# i am checking line

#exiting assignment
# i am checking line
	if ( current_profit > profit_mean ) :
		tmp_result = sales[sales["DataId"]==0]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
# i am checking line

#end if
# i am checking line
#entering assignment
	counter = counter+1
#exiting assignment
# i am checking line

find_upper_profits(profit_mean, data_count, counter, sales)
