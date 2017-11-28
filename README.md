# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임에 대한 [요구사항](https://nextstep.camp/courses/-KtTrisFbiAQW0Sgo7SV/-KtTwBuUZ1LpPGD3vc8o/lessons)을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 코드 리뷰 과정
> 저장소 브랜치에 자신의 github 아이디에 해당하는 브랜치가 존재해야 한다. 자신의 github 아이디에 해당하는 브랜치가 있는지 확인한다.
>
> 자신의 github 아이디에 해당하는 브랜치가 없는 경우 [브랜치 생성 요청](https://codesquad-members.slack.com/messages/C74HH4RJ8/) 채널을 통해 브랜치 생성을 요청한다.

----
1. 프로젝트를 자신의 계정으로 fork한다. 저장소 우측 상단의 fork 버튼을 활용한다.

2. fork한 프로젝트를 자신의 컴퓨터로 clone한다.
```
git clone https://github.com/{본인_아이디}/{저장소 아이디}
ex) https://github.com/javajigi/java-racingcar
```

3. clone한 프로젝트 이동
```
cd {저장소 아이디}
ex) cd java-racingcar
```

4. 본인 아이디로 브랜치를 만들기 위한 checkout
```
git checkout -t origin/본인_아이디
ex) git checkout -t origin/javajigi
```

5. 기능 구현을 위한 브랜치 생성
```
git checkout -b 브랜치이름
ex) git checkout -b step1
```

6. commit
```
git status //확인
git rm 파일명 //삭제된 파일
git add 파일명(or * 모두) // 추가/변경 파일
git commit -m "메시지" // 커밋
```

7. 본인 원격 저장소에 올리기
```
git push origin 브랜치이름
ex) git push origin step1
```

8.  github 서비스에서 pull request를 보낸다.
> pull request는 original 저장소의 브랜치(자신의 github 아이디)와 앞 단계에서 생성한 브랜치 이름을 기준으로 한다.
```
ex) code-squad/java-racingcar javajigi 브랜치 기준 => javajigi/java-racingcar step1
```

9. pull request를 통해 피드백을 받으면 코드를 수정한 후 같은 브랜치에 add, commit, push한다.

10. 리뷰어가 피드백을 마무리하고 codesquad 저장소로 merge하면 작업 브랜치를 삭제한다.
```
git checkout 본인_아이디
git branch -D 삭제할_브랜치이름
ex) git checkout javajigi
ex) git branch -D step1
```

11. merge한 codesquad 저장소와 동기화하기 위해 codesquad 저장소 추가(최초 한번만)
```
git remote add upstream base_저장소_url
ex) git remote add upstream https://github.com/code-squad/java-racingcar.git
// 위와 같이 base 저장소 추가한 후 remote 브랜치 목록을 본다.
git remote -v
```

12. base 저장소와 sync하기
```
git fetch upstream
git rebase upstream/본인_아이디
ex) git rebase upstream/javajigi
```

13. 5단계부터 다시 진행


## 동영상을 통한 코드 리뷰() 를 통해 참고 가능
* [fork하여 코드 리뷰하기](https://youtu.be/ZSZoaG0PqLg)
* [PR보내고 다시 PR보낼 때 유의 사항](https://youtu.be/CbLNbCUsh5c)

## 실습 중 모든 질문은 [슬랙 채널](https://codesquad-members.slack.com/messages/C74FV4Q10/)에서...