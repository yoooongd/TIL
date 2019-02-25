### 파이썬 로또(비복원 추출)

#1부터 45까지의 숫자 리스트를 만든다

#이중에서 6개를 뽑는다

#결과를 리턴한다

```python
import random

#numbers=[1~45]
#range함수:
#range라는 객체를 만들어줌. range(시작 값, 끝나는 숫자+1)

lotto=random.sample(range(1,46),6)
print(lotto)
print(sorted(lotto)) #정렬 내장함수
```



visual studio code