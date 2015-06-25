package cn.com.sy.util;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 2270248659981610944L;
	public PageResult() {
		curPage = 1;
		pageSize = 20;
		totalPages = 0;
		totalRecords = 0;
		records = null;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public String toString() {
		StringBuilder sbd = new StringBuilder();
		sbd.append("PageResult@");
		sbd.append(hashCode());
		sbd.append((new StringBuilder("[PSize=")).append(pageSize).append("; ")
				.toString());
		sbd.append((new StringBuilder("TPSize=")).append(totalPages)
				.append("; ").toString());
		sbd.append((new StringBuilder("TRSize=")).append(totalRecords)
				.append("; ").toString());
		sbd.append((new StringBuilder("CPage=")).append(curPage).append("; ")
				.toString());
		if (records.size() > 0)
			sbd.append((new StringBuilder("Class=")).append(
					records.get(0).getClass()).toString());
		sbd.append("]");
		return sbd.toString();
	}

	private int curPage;
	private int pageSize;
	private int totalPages;
	private int totalRecords;
	private List<T> records;
}