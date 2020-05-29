package com.capstone.project.logic;

public class Lists {
	private int num;
	private String name;
	private String type;
	private String brand;
	private String color;
	private int price;
	private String image;
	private String detail;
	private String modeling;
	
	
    private int page;
    private int perPageNum;

    public Lists() {
        this.page = 1;
        this.perPageNum = 10;
    }
    
    public int getPageStart() {
        return (this.page-1)*perPageNum;
    }
    
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        if(page <= 0) {
            this.page = 1;
        } else {
            this.page = page;
        }
    }
    public int getPerPageNum() {
        return perPageNum;
    }
    public void setPerPageNum(int pageCount) {
        int count = this.perPageNum;
        if(pageCount != count) {
            this.perPageNum = count;
        } else {
            this.perPageNum = pageCount;
        }
    }
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getModeling() {
		return modeling;
	}
	public void setModeling(String modeling) {
		this.modeling = modeling;
	}
    

	
}