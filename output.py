import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

varFileName = 'CRPPL/CSV Files/source/1000 - Sales Records.csv'
varDataSetName = 'CRPPL/CSV Files/target/sales.csv'
source = r'CRPPL/CSV Files/source/1000 - Sales Records.csv'
target = r'CRPPL/CSV Files/target/sales.csv'
shutil.copyfile(source,target)
sales = pd.read_csv('CRPPL/CSV Files/target/sales.csv')

#entering assignment
data_count = 3
#exiting assignment
#entering assignment
counter = 0
#exiting assignment
def get_country(counter, data_count, sales):
	if ( counter == 0 ) :
		tmp_result = sales[sales["DataId"]==0]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
	elif ( counter == 1 ) :
		tmp_result = sales[sales["DataId"]==1]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
	elif ( counter == 2 ) :
		tmp_result = sales[sales["DataId"]==2]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
	elif ( counter == 3 ) :
		tmp_result = sales[sales["DataId"]==3]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)
	elif ( counter == 4 ) :
		tmp_result = sales[sales["DataId"]==4]
		tmp_result = tmp_result[["Country"]]
		print(tmp_result)

#end if
	if ( counter < data_count ) :
#entering assignment
		counter = counter+1
#exiting assignment
		get_country(counter, data_count, sales)

#end if

get_country(counter, data_count, sales)
