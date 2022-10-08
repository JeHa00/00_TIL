# 0. Introduction

> 1. [왜 애자일인가?](#1-왜-애자일인가)
> 2. [애자일의 주요 원리](#2-애자일의-주요-원리)
> 3. [애자일과 스크럼](#3-애자일과-스크럼)
> 4. [실무에 스크럼 적용하기](#4-실무에-스크럼-적용하기)

- 해당 내용은 러닝스푼즈의 [[나노디그리]파이썬 장고 백엔드 개발자 부트캠프](https://learningspoons.com/course/detail/django-backend/) 로부터 학습한 자료입니다.

- 애자일와 스크럼에 대해 궁금하고, 정리가 안될 때마다 들어와서 학습해보자.  

<br>

---


# 1. 왜 애자일인가?

왜 애자일 방법론이 최근에 각광받고 있고, 전통적인 프로젝트 방법론과의 차이점을 알아보자.

## 1.1 애자일은 무엇인가?

<br>

### 애자일을 배워야하는 이유

> **_'지속가능한 개발'을 통해 '고객이 만족할만한 제품'을 '정해진 기한 내에' 만들기 위해서_**


왜 애자일을 배워야할까? 

최신 유행이라서? 경쟁사가 한다고 해서? 구글에서 권장하는 방법이라서? 

아니다. 아래 3가지 이유로 배워야 한다.

- **1. 고객이 진정 필요로 하는 제품을 만들기 위해서**  
    - 전제: 고객은 자신이 원하는 것을 정확히 알고 있지 못한다.

- **2. 정해진 기한 내에 문제를 해결하기 위해서**
    - 전제: '완벽한 제품'은 정해진 시간 안에 만들 수 있는 것이 아니다. 애자일 방법론에서 완벽한 제품은 존재하지 않는다.

- **3. 좀 더 지속가능한 직장생활(개발)을 하기 위해서**
    - 전제: 고객의 만족만큼이나 우리의 성장도 중요하다.  


![image](https://user-images.githubusercontent.com/78094972/184798947-d7cd8a05-3ae0-478d-87c5-754e51c2044f.PNG)

애자일: 상호 간의 몰이해, 오해로 인한 잘못된 제품 개발을 막기 위한 방법론  

<br>

### 고객이 원하는 제품을 만들기 위해서는

- 끊임없는 소통을 통해 문제를 '함께' 찾아간다.
    - 전제: 자신이 있는 위치에 따라 고객의 설명에 대한 이해가 다르다. 
    - 고객 자신도 몰랐던 니즈를 소통을 통해 찾아간다. 
    - 개발팀 내부에서도 지속적인 소통을 통해 맞춰가는 것을 중요하게 생각한다. 

- 고객의 니즈는 고정된 것이 아니며, 상황에 따라 변할 수 있음을 인정한다.  

<br>

### 정해진 기한 내에 문제를 해결하기 위해서는

- 완벽한 제품을 만들기보다는 '필요한 제품'을 만들기 위해 노력한다.

    - 완벽한 제품을 만들기 위해서 고객의 필요가 아닌 것을 만드는데 자원을 사용하기 보다는 고객의 니즈를 충족시키기 위한 최소한의 효율적인 제품을 만들기 위해 노력한다. 

- 한 번에 완성된 산출물을 내놓기보다는 일단 만들고 개선하기를 반복한다.
    - 만든 후, 고객의 피드백을 받아서 개선하는 걸 반복한다. 
    - 왜냐하면, 한 번의 완성된 제품을 내놓을려고 하다보면 정해진 기한에 내놓기가 어렵기 때문이다. 

<br>

### 고객의 만족과 우리의 성장을 함께 가져가기 위해서는

- 개인기가 우수한 사람보다 협업할 줄 아는 사람이 되어야 한다.

- 고객과의 소통만큼이나 팀 내부에서도 끊임없는 소통이 이뤄져야 한다.

- 제품을 만들 때 적용하는 모든 원칙은 우리 자신의 발전을 위해서도 적용할 수 있다.  

<br>

### 그래서 애자일은 무엇인가?

1. 하나의 단일한 매뉴얼이나 프레임워크가 아닌 '유연한 원칙과 철학의 집합'인 애자일 정신  

2. 구체적인 애자일 방법론은 위의 애자일 정신 내에서 조직의 상황과 여건에 따라 다르게 적용될 수 있다. 

3. 애자일은 한 번에 완성해낼 수 있는 '결과'가 아닌, 끊임없이 원칙을 실천해나가는 과정이다. 

<br>


---

## 1.2 워터폴 vs 애자일

![image](https://user-images.githubusercontent.com/78094972/185773949-d81a67d5-445b-417a-a90b-374fc9f0e507.png)

- 워터폴은 처음부터 완벽하게 만들어서 점차 늘려가는 것( 첫 번째)   
- 애자일은 밑그림부터 그려가면서 진행하는 것(두 번째)   
    - 5번까지 진행되지 않아도 벽에 걸어놓을 수 있는 수준까지 온다. 

### 워터폴이란?

> **_폭포수(Waterfall)가 떨어지듯이 부서별로 완성된 산출물을 다음 단계로 전달하는 방식_**     
> : 기획 -> 디자인 -> 개발 -> QA -> 런칭  

- **워터폴의 장점**
    - 과정별로 긴 시간을 들여 한 번에 '완벽한' 결과물을 만들어야할 때 적합 (ex: 금융)
        - 의료, 금융 분야는 애자일로 하기 힘들다. 

    - 각자가 자신이 맡은 부분에 대해서만 최선을 다하면 된다.  

    - 완벽한 문서화를 전제하고 있기 때문에, 부서간 의사소통의 필요가 적다. 


- **워터폴의 단점**
    
    - 고객의 요구와 시장의 변화에 대해 유연하게 대처할 수 없다.  
    
    - 한 곳에서 문제가 발생하면 프로젝트 전체가 좌초할 수 있다.  
        - 넘기는 과정에서 앞 부분에 수정이 필요할 때, 앞으로 돌아가야해서 프로젝트 전체에 영향을 준다.  

    - 그래서 예상치 못한 버그와 기획 오류에 취약하다.  
    
    - 정해진 시간 안에 과업을 완수해내기 어렵다.  

<br>

### 애자일은??

> **_'짧은 주기'로 제품의 개발과 개선을 반복하여 점진적인 품질의 향상을 추구해나가는 방식_**   
> :(기획 -> 디자인 -> 개발 -> QA -> 기획) -> 배포 -> (기획 -> 디자인 -> 개발 -> QA -> 기획) -> 배포  

- **애자일의 장점**
    - **시장과 고객의 요구에 유연하게 대응해야할 필요가 있을 때, 유용하다.**  
    - 치명적인 버그를 사전에 발견해 낼 기회가 많다.  
    - 과정 중 일부에서 문제가 발생할지라도 개선 사이클을 통해 대응할 수 있다.  
    - 주어진 기한 안에 완성된 형태의 제품을 내놓을 확률이 높다.  

- **애자일의 단점**
    - 단 한 번의 실수도 용납되지 않는 상황에선 적합하지 않을 수 있다.  
    - 조직 내부와 팀원 간에 소통의 문화가 형성되어 있지 않으면 실행이 불가능하다.  
    - 잦은 대화가 싫고, 완벽한 문서를 전달받기 원한다면 오히려 더 힘들 수도 있다.  
    - '내' 일의 범위를 넘어 다른 부문의 업무에 대해서도 적극적인 참여와 이해가 필요하다.  

<br>

---

## 1.3 애자일이 주목받는 이유

### 첫 번째, 시대의 변화

- 제품 생애주기의 단축 
    - 주요 하드웨어는 1년 주기로, 서비스는 수시로 형태를 바꾸는 현실  
        - 시장과 고객의 요구 변화가 하드웨어와 소프트웨어의 생애주기 발달로 수시로 바뀌고 있다. 그래서 잦은 업데이트를 수시로 빠르게 해야 한다. 그래서 애자일이 주목 받는다. 
    - 업데이트가 없는 서비스는 관심도 따라 잃게 된다.  


- 세대별 트랜드의 급격한 변화
    - 세대별로 사용하는 SNS와 서비스가 수시로 바뀌는 상황  
    - 10년전 최신 SNS였던 페이스북은 이제 '나이든 사람의 플랫폼'으로 인식  

<br>

### 두 번째, 기업의 변화

- 스타트업의 등장과 부상  
    - 가볍게 도전하고 재시도하는 스타트업의 민첩성이 성공의 키포인트로 부각
        - 스타트업은 적은 비용으로 빨리 시도해서 되는 쪽으로 빠르게 제품을 발전시키지 못하면 대기업을 이길 수 없기 때문이다.  
    - 대기업 역시도 스타트업의 속도를 따라잡지 못하면 도태되는 상황이 발생  


- 밀레니얼을 위한 기업문화의 변화가 필요
    - 수평적인 소통과 개인의 성장을 중요시하는 새로운 세대의 등장  
    - 기존의 수직적인 업무 방식을 벗어난 새로운 업무 방법론의 필요가 대두된다.  

<br>

### 세 번째, 기술의 변화 

- SaaS(Software as a Service), PaaS(Platform as a Service)의 등장  
    - SaaS와 PaaS를 통해 최신 기술을 간편하게 도입할 수 있게 된다.  
    - 기술적으로 새로운 시도를 하기 위한 비용이 크게 줄어든다.  

- 데이터 기반의 서비스 개선이 가능하다.  
    - 고객 데이터의 빠른 분석이 가능해지면서 서비스 개선주기 역시 짧아진다.  
    - 수시로 변하는 고객의 의향을 과학적으로 추적하여 서비스에 반영할 수 있다.  
 
<br>

### 애자일 도입 주요 사례 - Spotify

- 2008년 창업한 세계 1위의 음악 스트리밍 서비스 (Actice User 약 2억 2천만명)
- 자체적인 애자일 방법론 Spotify Model을 도입하여 성공적으로 적용
    - 기존 애자일 모델을 넘어서 Spotify Model을 만들어서 적용  

<br>

### 애자일 도입 주요 사례 - 카카오 

- 카카오톡, 카카오 미니, 카카오 뱅크 등 전 그룹에 걸쳐 애자일 방법론을 적용  
- AI 스피커 카카오 미니의 경우, 6개월만에 런칭 성공  
- 전 분야의 직원을 하나의 TF로 통합하여 빠른 토론과 의사결정을 유도  

<br>

### 애자일 도입 주요 사례 - ING 은행

- 네덜란드의 ING은행
    - 금융업은 워터폴이 적절하다고 했지만, 애자일을 적용한 사례  
- 각기 다른 분야의 직원을 9명씩 묶어 하나의 Squad를 구성  
- 말단 직원에 이르기까지 권한과 책임을 부여하여 '내재적 동기'를 부여  
- 2~3개월 걸리던 소프트웨어 업데이트 주기를 2주로 단축  


<br>

---

# 2. 애자일의 주요 원리

애자일의 주요 원리, 애자일 방법론에는 무엇이 있는지, 그리고 지켜야할 원칙들에 대해 알아보자.

## 2.1 애자일 매니페스토

- 애자일 선언이라 번역되기도 한다. 
- 2001년 개발방법론의 주요 대가 17명이 모여 만들어 낸 애자일의 기본 원칙  
- 4개의 선언과 12개의 원칙으로 이루어져 있다.  

```yaml
[애자일 소프트웨어 개발 선언]

우리는 소프트웨어를 개발하고, 또 다른 사람의 개발을 도와주면서 소프트웨어 개발의 더 나은 방법들을 찾아가고 있다.  
이 작업을 통해 우리는 다음을 가치 있게 여기게 되었다. 

공정과 도구보다 '개인과 상호작용'을 
포괄적인 문서보다 '작동하는 소프트웨어'를
계약 협상보다 '고객과의 협력'을 
계획을 따르기보다 '변화에 대응하기'를 

가치있게 여긴다. 

이 말은 왼쪽에 있는 것들도 가치가 있지만, 오른쪽에 있는 것들에 더 높은 가치를 둔다는 것이다. 
```

- 기존의 워터폴에서 중요하게 생각하는 것이 좌측이다. 그리고, 워터폴에서 중요하게 생각하지 않은 것은 우측의 것들이다. 그래서 이 우측의 것들을 더 중요하게 생각한다는 것이다.  

- 하지만 그렇다고 하여 좌측에 있는 것들이 가치가 없다는 의미가 아니다.  

<br>

### 2.1.1 공정과 도구보다 '개인과 상호작용'을 

- 기존의 방법론은 업무 프로세스의 개선을 최우선 순위로 둔다.  
- 그러나 아무리 좋은 프로세스도 '사람' 간의 소통이 없으면 무용지물이다.  
- 따라서 애자일 방법론은 개인 간의 상호작용을 통한 소통의 촉진을 우선으로 한다.  

<br>

### 2.1.2 포괄적인 문서보다 '작동하는 소프트웨어'를

- 애자일 방법론도 문서화의 필요 자체를 부정하지 않는다.  

- 그러나 완벽한 문서를 작성하는데 집착하면 리소스를 낭비할 수 있다.  
    - 기존 워터폴 방식에서는 상호작용이 필요없는 기획서를 만드는 게 미덕이었다면, 애자일은 최소한의 문서만 넘긴다.
    - 나머지는 소통하며 고친다.  

- 따라서 문서는 필요한, 최소한으로 생산하고 소프트웨어 개발 자체에 집중해야 한다.  


<br>

### 2.1.3 계약 협상보다 '고객과의 협력'을 

- 기존의 방법론에서는 초기의 계약 조건이 모든 산출물의 내용을 결정한다.  

- 그러나 고객의 요구사항은 항상 변화할 수 있기에, 성공적인 개발을 위해서는 유연한 대응이 필요할 때가 있다.  

- 따라서 애자일 방법론에서는 고객과의 끊임없는 의사소통을 통한 상호 협력과 배려를 중시한다.  




<br>

### 2.1.4 계획을 따르기보다 '변화에 대응하기'를 

- 기존의 방법론에서는 초기에 완벽한 계획을 세워 변화를 최소화하기 위해 노력한다.  

- 그러나 언제나 돌발상황은 발생할 수 있으며, 시장의 요구 또한 끊임없이 변화한다.  

- 따라서 애자일 방법론에서는 초기의 일정이나 투입 리소스에 변경이 있을지라도, 변화에 대응할 수 있는 유연한 계획을 세우도록 장려한다.  

<br>

### 2.1.5 애자일 선언 이면의 원칙

1. 우리의 최우선 순위는 가치있는 소프트웨어를 일찍 그리고 지속적으로 전달해서 고객을 만족시키는 것

2. 비록 개발의 후반부일지라도 요구사항 변경을 환경하자. 애자일 프로세스는 변화를 활용해 고객의 경쟁력에 도움이 되게 한다.  

3. 작동하는 소프트웨어를 자주 전달하라. 2주에서 2개월의 간격으로 하되 더 짧은 기간을 선호하라.  

4. 비즈니스쪽의 사람들과 개발자들은 프로젝트 전체에 걸쳐 날마다 함께 일해야 한다.  
    - 운영, 마케팅, 기획 등의 사람들과 머리를 맞대고 매일 일해야 한다.

5. 동기가 부여된 개인들 중심으로 프로젝트를 구성하라. 그들이 필요로 하는 환경과 지원을 주고 그들이 일을 끝내리라고 신뢰하라.  

6. 개발팀으로 또 개발팀 내부에서 정보를 전하는 가장 효율적이고 효과적인 방법은 면대면 대화다.  

7. 작동하는 소프트웨어가 진척의 주된 척도

8. 애자일 프로세스들은 지속 가능한 개발을 장려한다. 스폰서, 개발자, 사용자는 일정한 속도를 계속 유지할 수 있어야 한다.
    - 그래서 야근과 크런치를 지양한다.  

9. 기술적 탁월성과 좋은 설계에 대한 지속적 관심이 기민함을 높인다.

10. 단순성(안하는 일의 양을 최대화하는 기술)이 필수적
    - 최대한 필요한 일들만 수행한다.  

11. 최고의 아키텍처, 요구사항, 설계는 자기 조직적인 팀에서 창발한다. 

12. 팀은 정기적으로 어떻게 더 효과적이 될지 숙고하고, 이에 따라 팀의 행동을 조율하고 조정한다.  

<br>


---

## 2.2 다양한 애자일 실천방법

> **_칸반, XP, Spotify model, Scrum 등등_**

### 2.2.1 칸반(Kanban)

> 다양한 애자일 실천 방법 중에 적용하기 쉬운 방법론으로, doing에 올라가는 것을 조절한다.

칸반은 칸판의 일본어다.  

- 해야할 일(To-Do), 작업 중인 일(Doing), 완료된 일(Done)을 각각의 열(swim lane)에 표시한다. 
- 사업팀이 해야할 일을 결정하고, 개발팀이 작업이 개시된 후의 진행을 맡는다. 
- 동시에 진행가능한 아이템(Work-In-Progress)의 수를 제한하는 것이 핵심이다.  
    - doing에 올라가는 것을 조절  

- 간단하고 탄력적이며 심적인 부담이 적다.
    - 이것이 장점이자 단점인데, 긴장감을 떨어뜨려서 진행이 느려진다. 
- 신속한 진행을 위해서는 별도의 장치가 필요하다.  
- 일의 진행을 한 눈에 파악할 수 있다.  
- 쉽게 적용할 수 있다.  


🔅 참고 사이트: [칸반: 알아야할 이점, 프로세스 및 규칙](https://freshservice.com/ko/kanban/)


<br>

### 2.2.2 XP(Extreme Programming)

![image](https://www.digite.com/wp-content/uploads/2019/09/Extreme-Programming-XP.jpg)

- 비즈니스 요구의 변동이 심할 경우, 적합한 개발방법
- 구성원 개개인의 의사소통, 단순성, 피드백, 용기를 중시한다.  
- 방법론적으로는 테스트를 매우 중시하며 (Test Driven Development), Pair Programming이 특징이다.  
    - TDD: 코드를 짤 때, 일반적으로 모든 상황을 해결할 수 있는 코드를 만든 후, 이 코드를 테스트한다면 TDD는 정해진 값을 내놓을 수 있는 테스트 케이스를 만든 후, 이 케이스를 범용화하는 방식으로 일을 진행한다.

- 조금씩, 하지만 자주 배포한다.  
- 사이클을 반복해서 돌리며 개발한다.  
- 스펙에 없는 것은 절대 집어넣지 않는다.  
- 테스트 코드를 먼저 만든다.  
- 야근은 하지 않으며, 항상 정규 일과 시간에만 작업한다.  
- 기회가 생기는 족족 언제 어디서든 코드를 개선한다.
- 모든 테스트를 통과하기 전까지는 어떤 것도 발표하지 않는다.  
- 조금씩 발표하는 것을 기반으로 하여 현실적인 작업 계획을 만든다.  
- 모든 일을 단순하게 처리한다.  
- 두명씩 팀을 편성하고 모든 사람이 대부분의 코드를 알 수 있도록 돌아가면서 작업한다. 


<br>

### 2.2.3 Spotify model

> 조직 구성 방법에 가까운 애자일 방법론

![image](https://images.squarespace-cdn.com/content/v1/5b75a2b5620b85a1a78a5594/1592864530020-GF72O3K3M320ZFGN79UO/spotify+model.png?format=750w)



- Squad: 스포티파이 모델의 기본 단위, Product Owner와 함께 하나의 프로젝트를 진행
    - 모든 직군을 포함하는 10명 내외의 팀 
- Tribe: 물리적으로 같은 공간에서 일하는 Squad의 집합체, Tribe Lead가 배정되어 보조한다.  
    - 업무 연관성이 있는 사람들의 집합체로, Tribe Lead가 보조한다.  
- Chapter: 한 Tribe 내에 존재하는 직군별 모임  
    - Chapter Lead는 구성원 관리의 책임을 진다.   
- Guild: 공통의 직업적 관심분야, 또는 직군을 가진 사람들의 커뮤니티  
- What은 Squad와 Tribe가 결정, HOW는 Chapter와 Guild가 결정  


<br>

### 2.2.4 스크럼(Scrum)

> 가장 일반적으로 활용되는 애자일 방법론  

- 범용적으로 활용할 수 있으며 개발 스피드 유지에 효과적  
- Sprint: 한 번의 배포까지 소요되는 개발 기간(2~4주)
    - 움직이는 기간 단위  
- Product Owner(PO): '무엇'을 '왜'할 것인지 정하고 우선순위를 할당한다.  
- Dev Team: 이번 스프린트에서 얼마나 많은 일을 할 것인지 PO와 협의하여 결정하고, 제품을 개발한다.  
- Scrum Master: 팀이 잘 유지될 수 있도록, 팀원을 코칭하고 문제상황을 해결하며 있을 수 있는 마찰을 중재한다.  
    - 섬김의 리더십을 가진 리더  

<br>

---

## 2.3 애자일 도입 시 고려사항

### 2.3.1 충분한 자율성이 부여되었는가?

- 애자일의 핵심은 개발자의 자발성을 극대화하고(동기가 부여된 개인중심) 그들을 신뢰하는 것
- 자율성이 없는 조직은 자발적일 수 없으며, 신뢰받지 못하는 조직은 동기를 얻을 수 없다.  
- 어떤 방법론을 선택하건, 각자에게 부여된 권한을 침해하지 않고, 수평적인 접근이 이뤄져야 한다.  


<br>

### 2.3.2 충분한 소통이 이루어질 수 있는가?

- 모든 애자일 방법론은 변화에 대한 빠른 대응을 위해 면대면 소통을 강조한다.  
- 조직이 경직되어 있거나 지나치게 수직적일 경우, 조직원은 학습의 기회를 잃게 되며,  실수에 대한 보고 또한 늦어져 제품의 완성도도 떨어질 수 밖에 없다. 

- 따라서 유연하고 수직적인 문화를 형성하여 구성원 간의 소통을 활성화하는 것이 선결과제다.  

- 또한 각 방법론에서 정의하고 있는 미팅을 통해 의사소통이 기회 자체를 더 많이 만들어야 한다.  

<br>

### 2.3.3 우리 조직에 맞는 방식을 도입했는가?

- 어떠한 구체적인 애자일 방법론도 모든 기업과 상황을 커버할 수 없다.  
- 특정 방법론을 수정하여 도입하는 것도 가능하며, 2개 이상의 방법론을 섞어서 사용하는 것도 가능하다.  
- 단 애자일의 기본 규칙인 **신뢰, 소통, 자율, 지속가능성** 을 위반하고 있지는 않은지 고민이 필요하다.  

<br>

### 2.3.4 고객의 목소리를 제대로 듣고 있는가?

- 애자일의 궁극적인 목표는 결국 고객에게 만족스러운 결과물을 안겨주는 것  
- 이를 위해서는 팀 내부에서의 소통 이상으로 고객과의 소통이 필수적이다.  
- 따라서 가능한 제품 개발에 고객을 더 많이, 더 깊게 참여시켜 개발의 방향성을 점검해야 한다.  

<br>

### 2.3.5 뛰어난 애자일 코치가 있는가?

- 애자일은 결코 도입하기 쉬운 방법론도 아니고, 획일적으로 적용할 수 있는 방법론도 아니다.  

- 조직이 자신에게 맞는 방법을, 효율적으로 찾고, 유지할 수 있게 돕는 애자일 코치의 존재가 필수  

- 어떤 애자일 코치를 들이느냐에 따라 애자일 도입의 성패가 결정될 수 있다.  
    - 좋은 애자일 시스템을 유지하기 위해서는 애자일 코치가 필수다.  

- 좋은 애자일 코치의 가장 큰 역량을 사회적 소통능력과 협업능력

<br>

### 2.3.6 우리가 애자일에 대해 오해하고 있는 것은 없는가?

- 애자일은 100% 성공을 보장하지 않는다. 최악을 피할 수 있게 해줄 뿐이다.  
- 애자일은 일의 양을 줄여주지 않는다. 필요한 일에 집중할 수 있게 해주는 것 뿐이다.  
- 애자일 방법론 자체가 올바른 기업문화를 만들어주지 않는다. 기업문화 형성은 전제조건이다.  
- 애자일은 개발기간 자체를 단축시켜주지 않는다. 예상치 못한 기간 연장을 줄여줄 뿐이다.  
- 애자일도 설계, 기획, 문서를 없앨 수는 없다. 필요한 만큼만 하게 해줄 뿐이다.  
- 애자일은 개발 비용을 줄여주기 위한 것이 아니다. 효율적인 애자일 도입을 위해서는 자동화에 대한 투자가 필요하다.  
- **_애자일은 '최선의 결과물'을 '최대한 시간에 맞춰' 고객에게 전달하여 고객을 만족시키는 방법론이다._**   


<br>

---
# 3. 애자일과 스크럼

애자일 방법론 중 제일 광범위하게 사용하고, 많은 회사에서 애용하는 스크럼에 대해 알아보자. 

이 스크럼이 무슨 형식이고, 현실에서 적용할 때는 어떤 방식으로 적용하는지 알아보자.

## 3.1 스크럼은 무엇인가??

![image](https://user-images.githubusercontent.com/78094972/186048629-9188c71e-5c25-4356-8406-a66dc7da7669.png)


### 스크럼을 구성하는 가치 

- 용기: 옳은 일을 해내고 어려운 문제에 도전하기 위한 용기를 갖춘다.   
- 집중: 모두는 각 스프린트의 업무와 팀의 목표에 집중해야 한다.
- 헌신: 각자는 개인적으로 팀의 목표를 이루기 위해 헌신해야 한다.  
- 존중: 팀의 멤버는 서로를 능력 있는, 독립적인 사람으로서 존중해야 한다.  
- 개방: 팀의 멤버와 이해관계자들은 업무에 대한 모든 사항은 물론 업무에 수반되는 도전에 대해 개방적인 태도를 취해야 한다. 

<br>

### 스크럼을 구성하는 역할

- Product Owner
    - 업무의 'What' 과 'Why'를 결정한다.
    - Product Roadmap, Product Backlog, User Storie를 만들고 우선순위를 관리한다.   
    - 고객과 소통하여 제품의 인수조건을 결정한다.
    - 업무 결과에 대한 책임을 진다.  
    - 1명 
    
- Scrum Master    
    - 스크럼 프로세스가 올바르게 수행될 수 있도록 관리와 조언을 제공한다.  
    - 팀의 성장을 위해 필요한 코칭을 제공한다.
    - 원활한 개발을 막는 장애사항을 찾아내어 제거한다.
        - 기술적인 문제
        - 상부의 압력
        - 개발팀 간의 인간관계
        - PO와 개발팀 사이의 중재
        - 심적으로 피곤한 직업이라, 굉장히 인격자가 해야 한다. 
    - '관리자' 가 아닌 'Servant'  
    - 애자일 코치 역할을 맡음 
    - 1명
    
- Development Team
    - 실제로 제품을 개발하는 개발자, 디자이너, QA 등등 
    - 개별 스프린트에 어떤 과업을 수행할 것인지 PO와 협의하여 결정한다.
    - 업무의 'How'를 결정하고, 각 과업의 완료 여부를 판단한다. 
     
<br>

### 스크럼을 구성하는 이벤트

- 스프린트: 한 번의 배포가 이루어지기까지의 작업기간. 보통 2 ~ 4주
- 스프린트 플래닝: 개발팀과 PO가 모여 이번 스프린트에 어떤 일을 얼마나 할 것인지 정하고, Spring Backlog를 만들기 위한 회의 
- 데일리 스크럼(스탠드업): 매일 개발팀 인원들이 전일의 진행상황과 오늘 해야 할 일, 공유나 조언이 필요한 사항을 공유하고 간단하게 협의하기 위한 미팅. 총 15분을 넘지 않는 것이 좋다.   

- 스프린트 리뷰: 매 스프린트마다 PO 및 이해관계자들과 함께 해당 스프린트에서 진행된 사항을 공유하고, 피드백을 받기 위한 미팅

- 회고: 개발팀 자체적으로 이번 스프린트에서 잘했던 점과 개선해야할 점에 대해 논의하여 추후 더 나은 작업을 하기 위한 방법을 찾기 위한 미팅  

<br>

### 스크럼을 구성하는 산출물

- Product Roadmap: 중기(6개월 ~1년)에 걸쳐 제품이 나아가야할 방향과 과업을 정리  
- Product Backlog: Product Roadmap의 요소를 세분화하여 User Story 단위로 기록한 과업 우선순위 목록  
- Sprint Backlog: Product Backlog의 과업들 중 개별 스프린트에서 실행하기로 결정된 것들을 가져와 개발 가능한 최소 단위로 세분화한 목록  
- Product Increment: 개발을 통해 제품에 반영된 개선사항 또는 기능  

<br>

### 왜 스크럼을 하나요?

- 가능할 수 있는 최소한의 단위로 구성된 제품을 빠르게 내놓기 위해  
- 개발부터 배포까지의 주기(sprint) 동안 예상치 못한 새로운 일이 끼어들어 작업의 흐름을 방해하는 일이 없도록 하기 위해  
- 장기적인 제품의 목표를 가져가면서도 단기적으로 시장에 부합하는 제품을 만들기 위해  
- 개발팀의 자율성을 보장하면서도 고객의 니즈에 맞는 제품을 내놓기 위해  

<br>

### 이럴 땐 불리해요 

- 팀의 멤버가 물리적으로 서로 떨어져 있거나, 파트타임으로 구성되어 있을 경우  
- 각 멤버가 고도로 전문화된 기술을 가지고 있어 서로 도움을 주거나 대체하기 곤란한 경우  
- 외부 변동요인(정부 규제, 외부 제휴, 심사 통과)등이 많아 스프린트를 유지하기 곤란한 경우  
- 단번에 완성된 결과물을 배포하기에는 거쳐야 할 테스트가 너무 많거나 외부 기준이 높아 완벽한 개발이 요구되는 경우(Ex: 의료기기)

<br>

## 3.2 스크럼 제품 개발 프로세스

그러면 다시 아래 이미지를 봐보자.


![image](https://user-images.githubusercontent.com/78094972/186048629-9188c71e-5c25-4356-8406-a66dc7da7669.png)

### 첫 번째, Product Vision

- PO는 '어떤' 제품을 '왜' 만들어서 '무슨' 목표를 달성할 것인지에 대한 비전을 세운다.  
    - 가장 쉽게 적용하는 방법: Elevator Statement
        - WHO: 어떤 문제 또는 니즈를 가진
        - FOR: 유저집단을 위해  
        - THAT: 이런 핵심가치를 제공하자  
        - UNLIKE: 경쟁자와는 달리  
        - OUR PRODUCT: 이런 차별점을 가지고 있다.  

    - ex)
        - WHO: 문자메시지 요금이 부담스러운  
        - FOR: 스마트폰 유저를 위해  
        - THAT: 무료로 텍스트 소통을 가능하게 하자  
        - UNLIKE: 네이트온과는 달리  
        - OUR PRODUCT: 모바일에 최적화되어 있다. 

<br>

### 두 번째, Product Roadmap

> **_전사적 전략을 그리는 로드맵이 아닌 특정 '제품'에 대한 로드맵으로서, 시장의 변화에 따라 주기적으로 업데이트 되어야 할 필욕아 있다._**

- PO는 비전을 실행하기 위한 각 단계별로 어떤 조건이 충족되어야 할지에 대한 로드맵을 세운다.  

    - 보통의 경우, **분기별로 목표(Epic)** 를 세운다. 
        - 1Q
            - 연락처에 등록된 친구끼리 문자를 주고받을 수 있게 하자  
            - 사진파일 전송도 가능하게 하자  
        - 2Q
            - 사진 외의 동영상, 음성, 문서파일 전송 기능을 제공하자  
            - 연락처에 없는 친구는 아이디로 추가하게 하자 
        - 3Q
            - 캐릭터 이모티콘을 이용하여 감정을 표현할 수 있게 하자  
            - 그동안의 유저 피드백을 반영하여 UI를 개선하자  
        - 4Q
            - 해외 진출을 위해 다국어 지원을 제공하자  
            - 이모티콘을 유료로 구매할 수 있게 하자  

- 그래서 전사적 전략을 그리는 로드맵이 아닌 특정 '제품'에 대한 로드맵이며, 시장의 변화에 따라 주기적으로 업데이트 되어야 할 필요가 있다. 

- PO는 Product Roadmap의 Epic을 바탕으로 각 과업에 필요한 User story를 작성한다.  
- 작성된 User Story들을 우선순위를 세워 정렬한 다음 개발팀에 공유한다.  
- Product Backlog는 시장과 상황의 변화에 따라 수시로 갱신되어야 한다.  
    - Epic: 연락처에 등록된 친구끼리 문자를 주고받을 수 있게 하자. 
    - 나는 <유저>로서 <무엇을 하기> 위해 <무엇을 할 수 > 있다.
        - 나는 <발신자>로서 <문자를 보내기> 위해 <친구를 추가할 수> 있다.  
        - 나는 <수신자>로서 <내게 온 문자를 확인하기> 위해 <알림을 받을 수 > 있다. 

❗️User story는 User의 입장에서 epic을 쪼개는 걸 의미한다.  

### 세 번째, Product Backlog

- 유저 스토리를 잘 작성하기 위한 원칙(INVEST)
    - 개별 스토리는 독립적이어야 한다.(Independent)
    - 모든 스토리는 협상가능해야 한다. (Negotiable)
    - 고객에게 가치 있는 내용이어야 한다. (Valuable)
    - 일정산정이 가능할 정도로 구체적이어야 한다. (Estimable)
        - 뜬 구름 잡는 소리 ex) 문자를 입력하자. 
    - 최대한 작은 단위로 쪼개야 한다. (Small)
    - 테스트가 가능해야 한다. (Testable)

<br>

### 네 번째, Sprint Planning

- PO를 포함한 스크럼 팀 전체가 모여 이번 스프린트의 목표를 정하고, 어떤 유저 스토리를 개발할지 협의한다.  
- 어떤 것을 먼저 개발할지는 PO가 결정하지만, 얼마나 많이 개발할지는 개발팀이 정한다.  
- 어디까지 만들지가 정해지면, 각 유저스토리를 개발가능한 단위로 쪼개서 Sprint Backlog 형태로 정리하고, 개발 우선순위를 정한다.
- 정리된 sprint backlog를 토대로 팀원들에게 과업을 분배한다.  

- Sprint Backlog 예시
    - User Story: 나는 발신자로서 문자를 보내기 위해 친구를 추가할 수 있다.  
        - 과업 1: 핸드폰의 연락처에 접근하여 목록을 가져온다.  
        - 과업 2: 연락처에서 가져온 목록을 서버에 저장된 친구 리스트와 비교한다.  
        - 과업 3: 연락처에 추가된 내용이 있을 경우, 친구로 추가하여 저장한다.  
        - ....

- 즉, 개발자의 기준에서 과업을 쪼갠다. 개발팀 안에서 자체적으로 진행되는 일이다. 

<br>

### 다섯 번째, Sprint 

- 개별 스프린트는 2 ~ 4주 기준으로 돌아간다.  
- 개발팀은 스프린트 기간 동안 매일 스탠드업 회의를 통해 진척사항과 장애물을 공유한다.  
- 스크럼 마스터는 끊임없이 스프린트 진행에 방해되는 문제를 선제적으로 찾아 제거한다.  
- 스프린트 기간 동안 업무에 대한 전권은 개발팀이 갖는다.  
    - 어떻게 일할지, (스프린트 백로그 안에서) 무엇을 먼저 개발할지 등등

<br>

### 여섯 번째, Sprint Review

- 스프린트 기간이 끝나면 스크럼 마스터는 스크럼 팀원을 포함한 모든 이해당사자를 초청하여, 스프린트 리뷰를 진행한다.  

- 개발팀은 이번 스프린트에 있었던 개선사항과 성과를 모두에게 공유하고 시연한다.  
- 각 이해당사자는 이번 스프린트의 개선사항을 이해하고 다음 스프린트에 반영되었으면 하는 내용에 대해 PO와 팀에게 전달한다. 
- 이 회의는 2시간을 넘어서는 안되며, PT는 꼭 필요한 경우에만 최대한 간결하게 준비한다. 개선사항은 제품 자체를 통해 보여주는 게 최선이다. 

<br>

### 마지막, Retrospective(회고)

- 스프린트 리뷰가 끝나면 개발팀은 회고 모임을 소집한다. 
    - (PO의 참가는 선택사항, 진행은 스크럼 마스터 또는 개발팀원이 맡는다)

- 회고에서 개발팀은 각자 이번 스프린트에서 잘된 점, 아쉬웠던 점, (더 잘하기 위해) 앞으로 해보고 싶은 것들에 대해 각자 공유한다.
    - 이 때 한 명도 빠짐없이 얘기한다. 

- 회고는 누군가의 책임을 논하기 위한 회의가 절대 아니며, 특정인에 대한 비난이나 책임지우기는 철저하게 금지되어야 한다.  

- 개발팀은 각자의 발언을 바탕으로 다음 스프린트에 적용할 팀 단위의 개선사항(Action Item)을 찾아 결정한다.


<br>

---
# 4. 실무에 스크럼 적용하기

대규모 제품개발에서 스크럼을 사용할 때 이용할 수 있는 방법에 대해 알아보자. 



## 대규모 제품개발을 위한 스크럼

### 스크럼

- 원래의 스크럼은 10 ~ 14명 사이의 소규모 개발팀을 상정한 방법론
- 그래서 다수의 인원이 필요한 대형 프로젝트에는 좀 더 다른 방법론이 필요하다.  

<br>

### LeSS(Large-Scale Scrum)

![image](https://i0.wp.com/odd-e.kr/wp-content/uploads/2019/09/less-overview-diagram.png?w=2280&ssl=1)

- 스크럼을 대규모 개발팀에 적용하는 방법론  

### LeSS HUGE

- LeSS보다 더 큰 프로젝트에 적용  
    - PO 밑에 APO가 있다.  

<br>

## 대규모 스크럼 적용을 위한 팁

- 우선은 기초 제품 개발을 위한 1개의 소규모팀에서 시작하여 확장하는 게 좋다.  

- 2개 이상의 팀이 만들어질 경우, 공용으로 사용하는 컴포넌트를 유지보수하기 위한 '공용자원팀'을 별도의 스크럼 팀으로 만들어 두면 된다.

- 각 팀에서 개발한 것 중 다른 팀에서 재사용 가능성이 있는 부분은 공용자원팀이 관리하게 된다.  

- 가능한 많은 컴포넌트를 재사용이 가능한 공용자원으로 만들기  

- 공용자원팀을 포함한 각 팀의 스크럼 마스터는 1주에 1 ~ 2회씩 만나 팀의 상태와 진척상황에 대해 공유한다. 
    - 이것을 Scrum of Scrums라고 부른다.  

<br>

---


# Reference 

- [[나노디그리]파이썬 장고 백엔드 개발자 부트캠프](https://learningspoons.com/course/detail/django-backend/)