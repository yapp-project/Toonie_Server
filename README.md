# Toonie API
투니서버와 투니 앱클라이언트 사이에 쓰이는 API
RESTFull API로, JSON 형식으로 데이터를 주고 받는다.

## API list
1. App Vesion API -- 일단 패스
2. Token API -- 완성
3. Keyword API -- 완성
4. My Keyword API -- 완성
4. Tag API -- 완성
5. Toon API
6. Work List API 


-------

## 2.Token API
APP 사용자를 구분하기 위한 Token 값을 발급받기 위한 API로 발급 받은 Token을 APP에 저장하여 사용

### METHODE : GET
#### URL : /token

#### Request
```
    N/A(보내지 않음)
```

#### Response
| KEY | VALUE |
| :-----: | ------: |
| succees | API 호출 성공 여부 |
| token | 토큰값(12자리) |


```
    {
        "success" : "success",
        "token" : "190307000001"
    }
```

### Token 생성 규칙
22자리 숫자로 생성

-----------
## 3.Keyword API
키워드를 조회할 수 있는 API

### METHODE : GET
#### URL : /kewords
전체 키워드 리스트를 조회

#### Request 
```
    N/A(보내지 않음)
```

#### Response
| KEY | VALUE |
| :-----: | ------: |
| succees | API 호출 성공 여부 |
| keywords | 키워드들의 배열 |

```
    {
        "success" : true,
        "keywords" : [ "키워드1", "키워드2", "키워드3", ... ]
    }
```

### METHODE : GET
#### URL : /kewords/:keyword
특정 키워드 정보를 조회

#### Request 
```
    N/A(보내지 않음)
```

#### Response
| KEY | VALUE |
| :-----: | ------: |
| succees | API 호출 성공 여부 |
| toon_keyword | 키워드  |
| tags | 태그 배열 |


```
    {
        "success" : true,
        "toonKeyword" : "메롱"
        "tags" : [ "태그1", "태그2", "태그2", ... ]
    }
```


-------------
## 4.MyKeyword API
사용자가 Mykeyword를 등록하고 조회할 수 있는 API

### METHODE : GET
#### URL : /mykewords/:token
해당 사용자의 Mykeyword 리스트 조회

#### Request 
```
    N/A(보내지 않음)
```

#### Response
| KEY | VALUE |
| :-----: | ------: |
| succees | API 호출 성공 여부 |
| keywords | 키워드들의 배열 |

```
    {
        "success" : true,
        "token" : toekn,
        "keywords" : [ "키워드1", "키워드2", "키워드3", ... ]
    }
```

### METHODE : POST
#### URL : /mykewords/:token
해당 사용자의 MyKeyword 등록

#### Request 
```
    {
        "keywords" : ["키워드1", "키워드2" ...]
    }
```

#### Response
| KEY | VALUE |
| :-----: | ------: |
| succees | API 호출 성공 여부 |

```
    {
        "success" : true
    }
```


## 5.Tag API
태그 정보를 조회할 수 있는 API

### METHOD : GET
#### URL : /tags/

#### RESPONSE
```
    {
        "succeess": true,
        "tagList": [
            "IOS개발자",
            "바보",
            "서버개발자",
            "천재"
        ]
    }
```

### METHOD : GET
#### URL : /tags/token/:token
해당 토큰 사용자가 선택한 키워드의 하위 tag 정보(태그, 웹툰정보 리스트)

#### RESPONSE

```
{
    "toonList": [
        {
            "toonID": "toon1",
            "toonName": "멍멍이일기",
            "instaID": "jo.eddy.12",
            "instaUrl": "https://www.instagram.com/jo.eddy.12/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/fda0ccda4355109988d711cfc6be6329/5D2B96EF/t51.2885-19/s320x320/50773796_368162570404956_1137398530726428672_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "멍멍이 왈왈",
            "instafollowerCnt": "10만",
            "instaPostCnt": "777",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/350ef600705f8947e2af85dfc17e7169/5D379747/t51.2885-15/sh0.08/e35/s640x640/52153157_312323846139271_641212107355552306_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "IOS개발자",
                "IOS개발자",
                "바보"
            ]
        },
        {
            "toonID": "toon2",
            "toonName": "어진일기",
            "instaID": "eozinee",
            "instaUrl": "https://www.instagram.com/eozinee/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/d896b3361fc51a587c74e42463d99158/5D3F814B/t51.2885-19/s320x320/47585461_284206972453575_9141761293089243136_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "IOS 노예",
            "instafollowerCnt": "5",
            "instaPostCnt": "7",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/dc4772d04cdadd493564f9468877d3ae/5D409CC7/t51.2885-15/e35/c92.0.366.366/38285709_2611697445522371_3687289785086377984_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "IOS개발자",
                "서버개발자"
            ]
        },
        {
            "toonID": "toon3",
            "toonName": "디자이너일기",
            "instaID": "mulgri",
            "instaUrl": "https://www.instagram.com/mulgri/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/86b3f2e05240723b148c8dffaaec80d3/5D4E3261/t51.2885-19/s320x320/30602565_223943415020227_1274941375162351616_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "수석뒤자이너 한소른입니다.",
            "instafollowerCnt": "100만",
            "instaPostCnt": "423",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/4aef6803b90b7c1104374452fce3f6d2/5D3648B0/t51.2885-15/sh0.08/e35/s640x640/54731932_841985386135603_3820896256715464514_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "천재"
            ]
        }
    ]
}
```


### METHOD : GET
#### URL : /tags/:tags
사용자가 선택한 태그에 포함된 정보(태그 웹툰정보 리스트)

#### RESPONSE
```
{
    "toonTag": "IOS개발자",
    "toonInfoList": [
        {
            "toonID": "toon1",
            "toonName": "멍멍이일기",
            "instaID": "jo.eddy.12",
            "instaUrl": "https://www.instagram.com/jo.eddy.12/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/fda0ccda4355109988d711cfc6be6329/5D2B96EF/t51.2885-19/s320x320/50773796_368162570404956_1137398530726428672_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "멍멍이 왈왈",
            "instafollowerCnt": "10만",
            "instaPostCnt": "777",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/350ef600705f8947e2af85dfc17e7169/5D379747/t51.2885-15/sh0.08/e35/s640x640/52153157_312323846139271_641212107355552306_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "IOS개발자",
                "IOS개발자",
                "바보"
            ]
        },
        {
            "toonID": "toon2",
            "toonName": "어진일기",
            "instaID": "eozinee",
            "instaUrl": "https://www.instagram.com/eozinee/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/d896b3361fc51a587c74e42463d99158/5D3F814B/t51.2885-19/s320x320/47585461_284206972453575_9141761293089243136_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "IOS 노예",
            "instafollowerCnt": "5",
            "instaPostCnt": "7",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/dc4772d04cdadd493564f9468877d3ae/5D409CC7/t51.2885-15/e35/c92.0.366.366/38285709_2611697445522371_3687289785086377984_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "IOS개발자",
                "서버개발자"
            ]
        },
        {
            "toonID": "toon1",
            "toonName": "멍멍이일기",
            "instaID": "jo.eddy.12",
            "instaUrl": "https://www.instagram.com/jo.eddy.12/",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/fda0ccda4355109988d711cfc6be6329/5D2B96EF/t51.2885-19/s320x320/50773796_368162570404956_1137398530726428672_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instaInfo": "멍멍이 왈왈",
            "instafollowerCnt": "10만",
            "instaPostCnt": "777",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/350ef600705f8947e2af85dfc17e7169/5D379747/t51.2885-15/sh0.08/e35/s640x640/52153157_312323846139271_641212107355552306_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "IOS개발자",
                "IOS개발자",
                "바보"
            ]
        }
    ]
}
```