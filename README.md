# Toonie API
투니서버와 투니 앱클라이언트 사이에 쓰이는 API
RESTful API로, JSON 형식으로 데이터를 주고 받는다.

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

### METHOD : GET
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
        "success" : success,
        "token" : "190307000001"
    }
```

### Token 생성 규칙
22자리 숫자로 생성

-----------
## 3.Keyword API
키워드를 조회할 수 있는 API

### METHOD : GET
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

### METHOD : GET
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


### METHOD : GET
#### URL : /keywords/toonlist/:keyword

```
{
    "keyword": "여행",
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
            ],
            isWorkList:true
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
            ],
            isWorkList:true
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
            ],
            isWorkList:false
        }
    ]
}
```


-------------
## 4.MyKeyword API
사용자가 Mykeyword를 등록하고 조회할 수 있는 API

### METHOD : GET
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

### METHOD : POST
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
#### URL : /tags/curationtags
나는 000한 웹툰이 보고 싶어요에서 태그 누르면 나오는 태그들 뿌릴 때 사용하면 됩니다.

#### RESPONSE
```
{
    "succeess": true,
    "curationTagList": [
        "IOS를 애증한다면",
        "맹구 같은",
        "API 그만 만들고 싶으면",
        "천재가 나오는"
    ]
}
```

### METHOD : GET
#### URL : /tags/token/:token
해당 토큰 사용자가 선택한 키워드의 하위 tag 정보(태그, 웹툰정보 리스트)
당신이 좋아할거 같아서 메뉴에 불러오면 됩니다.

#### RESPONSE

```
{
    "toonList": [
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
            ],
            "curationTagList": [
                "IOS를 애증한다면",
                "API 그만 만들고 싶으면"
            ]
        }
    ]
}
```


### METHOD : GET
#### URL : /tags/curationtag/:curationtag
나는 000한 웹툰이 보고 싶어요에서 태그 누르면 나오는 태그를 선택할 시 나오는 툰 정보를 불러올때 사용합니다.

#### RESPONSE

```
{
    "toonTag": "고양이를 모시고 사는",
    "toonInfoList": [
        {
            "toonID": "toon13",
            "toonName": "홍조/홍조일기",
            "instaID": "cathongzo",
            "instaUrl": "https://instagram.com/cathongzo?utm_source=ig_profile_share&igshid=1nkfg3yue7quz",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/b9d1c99de7ded599c4d9e6d20c9aa702/5D2F3988/t51.2885-19/s320x320/39265289_698697493814041_3439567053684473856_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instafollowerCnt": "531",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/659d815fb2b6d740b677a3c902507f2c/5D44DAAA/t51.2885-15/sh0.08/e35/c0.135.1080.1080/s640x640/53297111_427222888025147_3073937013126858222_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "고양이"
            ],
            "curationTagList": [
                "고양이를 모시고 사는"
            ]
        },
        {
            "toonID": "toon14",
            "toonName": "재수의 연습장",
            "instaID": "jessoo",
            "instaUrl": "https://instagram.com/jessoo?utm_source=ig_profile_share&igshid=1gs688k9j21vo",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/78fffdb19f582bfb37d3464785104f5a/5D33386B/t51.2885-19/s320x320/23498804_143252142973715_2931208904849227776_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instafollowerCnt": "1638",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/6e373dd22d05095eb0b995c35f193905/5D3BF3FE/t51.2885-15/e35/c0.52.640.640a/54511332_419764862167329_1771643485603758896_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "고양이",
                "커플"
            ],
            "curationTagList": [
                "고양이를 모시고 사는",
                null
            ]
        },
        {
            "toonID": "toon7",
            "toonName": "싕싕",
            "instaID": "seeng-seeng_",
            "instaUrl": "https://instagram.com/seeng_seeng_?utm_source=ig_profile_share&igshid=q6vamgsrld4x",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/ceff672caf52b80705b295c2f9297e7e/5D2F8DE6/t51.2885-19/s320x320/28435478_109936443170931_4411977641255501824_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instafollowerCnt": "760",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/295d53369a6b5de714b9f320f13c6404/5D49ABB1/t51.2885-15/sh0.08/e35/s640x640/54247734_184502272528297_3012809233166541463_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "고양이"
            ],
            "curationTagList": [
                "고양이를 모시고 사는"
            ]
        },
        {
            "toonID": "toon8",
            "toonName": "남씨",
            "instaID": "namsee",
            "instaUrl": "https://instagram.com/namsee.jpg?utm_source=ig_profile_share&igshid=10ydylfdpwubn",
            "instaThumnailUrl": "https://scontent-icn1-1.cdninstagram.com/vp/1fe9ab37908d6a00d9b97fcc5b9b8158/5D349406/t51.2885-19/s320x320/45341949_320587371877750_7103955454673289216_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "instafollowerCnt": "699",
            "instaLatestPostUrl": "https://scontent-icn1-1.cdninstagram.com/vp/c618edcc719e2ffb51c01db456ff6c9a/5D3C770F/t51.2885-15/sh0.08/e35/s640x640/53827131_788818868170815_4618786818930756885_n.jpg?_nc_ht=scontent-icn1-1.cdninstagram.com",
            "toonTagList": [
                "고양이"
            ],
            "curationTagList": [
                "고양이를 모시고 사는"
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
