package com.ymall.service;

import com.github.pagehelper.PageInfo;
import com.ymall.common.ServerResponse;
import com.ymall.pojo.Product;
import com.ymall.vo.ProductDetailVo;

public interface ProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> updateSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId,
                                                         int pageNum, int pageSize, String orderBy);
}
