First exercise:
    The system is randomly crashing and shows error: Resource Limit Is Reached
The website is temporarily unable to service your request as it exceeded resource limit. Please try again later.

Second exercise:

Making a request with the wrong input will return status code 200, even though the input is wrong
```
{
    "id": "13"
}
```

Making a request with different wrong input will return status code 500
```
{
    "id": "string"
}
```

And other similar issues appear and are visible through running the api test class

