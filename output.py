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
data_count = 3
#exiting assignment
# i am checking line
#entering assignment
counter = 0
#exiting assignment
# i am checking line
def get_country(counter, data_count, sales):
	if ( counter == 0 ) :
		tmp_result = sales[sales["DataId"]==0]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
# i am checking line
	elif ( counter == 1 ) :
		tmp_result = sales[sales["DataId"]==1]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
# i am checking line
	elif ( counter == 2 ) :
		tmp_result = sales[sales["DataId"]==2]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
# i am checking line
	elif ( counter == 3 ) :
		tmp_result = sales[sales["DataId"]==3]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
# i am checking line
	elif ( counter == 4 ) :
		tmp_result = sales[sales["DataId"]==4]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)

	if ( counter < data_count ) :
#entering assignment
		counter = counter+1
#exiting assignment
# i am checking line
		get_country(counter, data_count, sales)

#end if
# i am checking line

get_country(counter, data_count, sales)
