##Albums Application

###Description
Albums application is a spring boot application that can be used to manage information about albums and bands.
It exposes different endpoints for inserting, retrieving and removing data.

###Starting the Server

- Open the AlbumsApplication.java file.
- Click on the play button and click on `Run 'AlbumsApplication'`.
- The server will be started and you can access the different endpoints with a client like postman.


###API

####Get Albums
 `GET` `http://localhost:8080/albums`

You can make a GET request to the above end point to get all the albums.

####Get Album by ID
`GET` `http://localhost:8080/album/{id}`

You can make a GET request to the above end point with album ID as path parameter to get the particular album details.

####Get Albums of an Album's Band
`GET` `http://localhost:8080/albums-of-album-band/{albumName}`

You can make a GET request to the above end point with album name as path parameter to get all the albums of that band.

####Create an Album
`POST` `http://localhost:8080/album`

######JSON Body
```
{
    name: name of album,
    released: release date (yyyy-MM-dd),
    description: album description,
    songsCount: number of songs,
    bandId: id of band
}
```

####Delete Album by ID
`DELETE` `http://localhost:8080/album/{id}`

You can make a DELETE request to the above end point with album ID as path parameter to delete the particular album.

