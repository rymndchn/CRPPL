import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

source = r'CRPPL/CSV Files/source/1000 - Emp Leaves.csv'
target = r'CRPPL/CSV Files/target/emps.csv'
shutil.copyfile(source,target)
emp = pd.read_csv('CRPPL/CSV Files/target/emps.csv')

# i am checking line
tmp_result = emp[(emp["Description"]=='mark')&(emp["Leave"]==0)]

tmp_result = tmp_result[["Description","Leave"]]
print(tmp_result)
# i am checking line
