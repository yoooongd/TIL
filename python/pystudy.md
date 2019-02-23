## 튜플(Tuple)

```python
t1 = ()
t2 = (1,)
t3 = (1, 2, 3)
t4 = 1, 2, 3
t5 = ('a', 'b', ('ab', 'cd'))
```

## 딕셔너리(Dictionary)

딕셔너리는 리스트나 튜플처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.

```python
a = {'name': 'pey', 'phone': '0119993323', 'birth': '1118'}
a.keys()
dict_keys(['name', 'phone', 'birth'])


for k in a.keys():
	print(k) #단, 리스트가 아니기 때문에 리스트는 list를 사용하여 형변환 해줘야함.
    
#list(a.keys())

```

a.values()는 value값을 가져오고

key, value 쌍을 얻으려면 a.items() 사용하면 됨.



#### key로 value얻기 (get)

```python
a = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}
a.get('name')
'pey'
a.get('phone')
'0119993323'
```

