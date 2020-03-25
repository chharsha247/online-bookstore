import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';


@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[]=[];
  constructor( private _bookService:BookService) { }

  ngOnInit(): void {
    this.listBooks();
  }
  listBooks(){
    this._bookService.getbooks().subscribe(
      data=>this.books=data
    )
  }

}
/*{
  sku:"text-101",
  name:"C/ programming",
  description: "Learn c lang",
  unitPrice: 900,
  imageUrl: "img.jpg",
  active: true,
  unitsInStock: 100,
  createdOn: new Date(),
  updatedOn: null,
},
{
  sku:"text-102",
  name:"C# programming",
  description: "Learn c# lang",
  unitPrice: 800,
  imageUrl: "img1.jpg",
  active: true,
  unitsInStock: 200,
  createdOn: new Date(),
  updatedOn: null,
},
{
  sku:"text-103",
  name:"java programming",
  description: "Learn java lang",
  unitPrice: 800,
  imageUrl: "img2.jpg",
  active: true,
  unitsInStock: 30,
  createdOn: new Date(),
  updatedOn: null,
}*/